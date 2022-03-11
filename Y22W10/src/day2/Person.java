package day2;

public class Person {
	private final String name;
	private int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	void hasBirthday() {
		age += 1;
	}
	
	@Override
	public String toString() {
		return name + " has age " + age;
	}
}
