package day3;

public class Driver {
	private String name;
	
	Driver(String name) {
		this.name = name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
