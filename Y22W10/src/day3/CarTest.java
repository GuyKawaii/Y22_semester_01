package day3;

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car("Tesla", "3", "Elon get us to the moon");
		Driver d1 = new Driver("Patrik");
		
		c1.setDriver(d1);
		c1.drive();
		c1.turnEngineOn();
		c1.drive();
		c1.park();
		System.out.println(c1.getDriver());
		
		
	}
}
