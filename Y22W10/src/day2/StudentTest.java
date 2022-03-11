package day2;

import java.util.Arrays;

public class StudentTest {
	public static void main(String[] args) {
		int[] grades = {-3, 0, 2, 4, 7, 10, 12};
		Student s1 = new Student("Malik");
		
		System.out.println(s1.getName());
		System.out.println(Arrays.toString(s1.getGrades()));
		
		// add all legal grades
		for (int grade : grades) {
			s1.addGrade(grade);
			System.out.println("added grade: " + s1.getLatestGrade());
		}
		
		System.out.println(s1.getName());
		System.out.println(Arrays.toString(s1.getGrades()));
	}
}
