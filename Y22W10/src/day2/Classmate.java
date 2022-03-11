package day2;

public class Classmate {
	String name;
	String email;
	String phoneNumber;
	
	Classmate(String name, String email, String phoneNumber) {
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return name + " /info/ email: " + email + ", phone: " + phoneNumber;
	}
}
