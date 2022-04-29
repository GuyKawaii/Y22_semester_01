package day1;

public abstract class Bil {
  private String regNr;
  private String brand;
  private String model;
  private int year;
  private int numDoors;
  
  public Bil(String regNr, String brand, String model, int year, int numDoors) {
    this.regNr = regNr;
    this.brand = brand;
    this.model = model;
    this.year = year;
    this.numDoors = numDoors;
  }
  
  public abstract double beregnGrønEjerafgift();
  
  public String getRegNr() {
    return regNr;
  }
  
  public void setRegNr(String regNr) {
    this.regNr = regNr;
  }
  
  public String getBrand() {
    return brand;
  }
  
  public void setBrand(String brand) {
    this.brand = brand;
  }
  
  public String getModel() {
    return model;
  }
  
  public void setModel(String model) {
    this.model = model;
  }
  
  public int getYear() {
    return year;
  }
  
  public void setYear(int year) {
    this.year = year;
  }
  
  public int getNumDoors() {
    return numDoors;
  }
  
  public void setNumDoors(int numDoors) {
    this.numDoors = numDoors;
  }
  
}
