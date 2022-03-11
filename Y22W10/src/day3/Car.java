package day3;

public class Car {
	private String brand;
	private String model;
	private String honk;
	private boolean isEngineOn;
	private Driver driver;
	
	Car(String brand, String model, String honk) {
		this.brand = brand;
		this.model = model;
		this.honk = honk;
		this.isEngineOn = false;
	}
	
	void setBrand(String brand) {
		this.brand = brand;
	}
	
	String getModel() {
		return model;
	}
	
	void setModel(String model) {
		this.model = model;
	}
	
	String geHonk() {
		return honk;
	}
	
	void setHonk(String honk) {
		this.honk = honk;
	}
	
	String getHonk() {
		return honk;
	}
	
	void sound() {
		if (driver != null)
			System.out.println(honk);
		else
			System.out.println("No driver to honk");
	}
	
	void turnEngineOn() {
		if (driver != null)
			isEngineOn = true;
		else
			System.out.println("No driver to turn on");
	}
	
	void turnEngineOff() {
		if (driver != null)
			isEngineOn = false;
		else
			System.out.println("No driver to turn off");
	}
	
	void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	Driver getDriver() {
		return driver;
	}
	
	void drive() {
		if (isEngineOn && driver != null)
			System.out.printf("%s %s drives\n", brand, model);
		else
			System.out.println("Engine is turned off");
	}
	
	void park() {
		if (driver == null)
			System.out.println("No driver to park");
		else if (!isEngineOn)
			System.out.println("Engine is off");
		else
			System.out.printf("%s %s has parked\n", brand, model);
	}
	
	@Override
	public String toString() {
		return brand + " " + model + " with honk: " + honk;
	}
}
