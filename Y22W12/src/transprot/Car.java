package transprot;

public class Car extends Vehicle {
  Car(String name) {
    super(name);
  }
  
  @Override
  String drive() {
    if (getEngineStarted())
      return "Car driving";
    else
      return "Car engine not started";
  }
  
}
