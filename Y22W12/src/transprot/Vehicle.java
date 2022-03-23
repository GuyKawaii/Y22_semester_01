package transprot;

public abstract class Vehicle {
  private boolean engineStarted = false;
  private String name;
  
  Vehicle(String name) {
    this.name = name;
  }
  
  String startEngine() {
    engineStarted = true;
    return String.format("%s engine started", this.getClass().getSimpleName());
  }
  
  boolean getEngineStarted() {
    return engineStarted;
  }
  
  String drive() {
    return null;
  }
  
  @Override
  public String toString() {
    return name;
  }
}
