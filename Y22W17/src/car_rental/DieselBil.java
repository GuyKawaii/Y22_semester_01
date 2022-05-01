package car_rental;

public class DieselBil extends Bil {
  private boolean harPartikelfilter;
  private double kmPrL;
  
  public DieselBil(String regNr, String brand, String model, int year, int numDoors, boolean harPartikelfilter, double kmPrL) {
    super(regNr, brand, model, year, numDoors);
    this.harPartikelfilter = harPartikelfilter;
    this.kmPrL = kmPrL;
  }
  
  public boolean isHarPartikelfilter() {
    return harPartikelfilter;
  }
  
  public void setHarPartikelfilter(boolean harPartikelfilter) {
    this.harPartikelfilter = harPartikelfilter;
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
    
    // extra - udligningsafgift
    if (kmPrL < 5) afgift += 15260;
    else if (kmPrL <= 10) afgift += 2770;
    else if (kmPrL <= 15) afgift += 1850;
    else if (kmPrL <= 20) afgift += 1390;
    else if (kmPrL <= 50) afgift += 130;
    
    
    return afgift;
  }
  
  @Override
  public String toString() {
    return "DieselBil{" +
           "harPartikelfilter=" + harPartikelfilter +
           ", kmPrL=" + kmPrL +
           '}';
  }
}
