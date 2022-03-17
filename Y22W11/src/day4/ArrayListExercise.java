package day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise {
	public static void main(String[] args) {
		String[] names = {"Harry", "Ron", "Hermione"};
		ArrayList<String> people = new ArrayList<>(List.of(names));
		System.out.println(people);
		people.add("Draco");
		people.add("Nevile");
		System.out.println(people);
		people.add(1, "Cho");
		System.out.println(people + ">");
		people.set(1, "Ginny");
		System.out.println(people + "<");
		
		
		List youThree = people.subList(0,3);
		System.out.println(youThree);
		
		people.addAll(List.of(new String[]{"Fred", "George"}));
		System.out.println(youThree);



		
//		int result = people.indexOf("Fred");
//		people.remove(result);
	
	}
}
