package day1;

public class ElBil extends Bil {
  private int batterikapacitetKWh;
  private double whPrKm;
  private int maxKm;
  
  public ElBil(String regNr, String brand, String model, int year, int numDoors, int batterikapacitetKWh, int maxKm, double whPrKm) {
    super(regNr, brand, model, year, numDoors);
    this.batterikapacitetKWh = batterikapacitetKWh;
    this.maxKm = maxKm;
    this.whPrKm = whPrKm;
  }
  
  public int getBatterikapacitetKWh() {
    return batterikapacitetKWh;
  }
  
  public void setBatterikapacitetKWh(int batterikapacitetKWh) {
    this.batterikapacitetKWh = batterikapacitetKWh;
  }
  
  public double getWhPrKm() {
    return whPrKm;
  }
  
  public void setWhPrKm(double whPrKm) {
    this.whPrKm = whPrKm;
  }
  
  public int getMaxKm() {
    return maxKm;
  }
  
  public void setMaxKm(int maxKm) {
    this.maxKm = maxKm;
  }
  
  public double beregnGrønEjerafgift() {
    double afgift = 0.0;
    double kmPrL = (whPrKm / 91.25) / 100;
  
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
    return "ElBil{" +
           "batterikapacitetKWh=" + batterikapacitetKWh +
           ", whPrKm=" + whPrKm +
           ", maxKm=" + maxKm +
           '}';
  }
}
