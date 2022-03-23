package transprot;

import java.util.ArrayList;

public class VehicleTestDrive {
  public void go() {
    ArrayList<Vehicle> vehicles = new ArrayList<>();
    Car c1 = new Car("Bimmer");
    Ship s1 = new Ship("Raft");
    Plane p1 = new Plane("Batman");
    vehicles.add(c1);
    vehicles.add(s1);
    vehicles.add(p1);
    
    for (Vehicle vehicle : vehicles) {
      printVehicle(vehicle);
    }
  }
  
  public void printVehicle(Vehicle vehicle) {
    System.out.printf("""
            VEHICLE: %s "%s"
            %s
            Is engine on: %s
            %s
            Is engine on: %s
            %s
            
            """,
        vehicle.getClass().getSimpleName(),
        vehicle,
        vehicle.drive(),
        vehicle.getEngineStarted(),
        vehicle.startEngine(),
        vehicle.getEngineStarted(),
        vehicle.drive());
  }
  
  public static void main(String[] args) {
    new VehicleTestDrive().go();
  }
}
