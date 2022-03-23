package transprot;

public class Plane extends Vehicle {
  Plane(String name) {
    super(name);
  }
  
  @Override
  String drive() {
    if (getEngineStarted())
      return "Plane flying";
    else
      return "Plane engine not started";
  }
  
}
