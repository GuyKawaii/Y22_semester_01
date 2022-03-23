package transprot;

public class Ship extends Vehicle {
  Ship(String name) {
    super(name);
  }
  
  @Override
  public String drive() {
    if (getEngineStarted())
      return "Ship sailing";
    else
      return "Ship engine not started";
  }
  
}
