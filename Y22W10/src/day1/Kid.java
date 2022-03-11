package day1;

public class Kid {
	private String name;
	private int yearOfBirth;
	
	public Kid(String nameIn, int yearOfBirthIn) {
		this.name = nameIn;
		this.yearOfBirth = yearOfBirthIn;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	
	public void setYearOfBirth(int newYearOfBirth) {
		yearOfBirth = newYearOfBirth;
	}
	
	public String toString() {
		return "Kid: " + name + " is born in year: " + yearOfBirth;
	}
}
