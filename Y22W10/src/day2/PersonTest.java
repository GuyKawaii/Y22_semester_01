package day2;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("Albert" , 20);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(p1.getAge());
			p1.hasBirthday();
		}
		System.out.println(p1);
		
	}
}
