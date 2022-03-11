package day2;

public class Student {
	private final String name;
	private final int[] grades;
	private int gradeIndex;
	private final int[] gradesLegal = {-3, 0, 2, 4, 7, 10, 12};
	
	Student(String name) {
		this.name = name;
		this.grades = new int[7];
		this.gradeIndex = -1;
	}
	
	int[] getGrades() {
		return grades;
	}
	
	String getName() {
		return name;
	}
	
	int getLatestGrade() {
		if (gradeIndex == -1) {
			return 0;
		}
		
		return grades[gradeIndex];
	}
	
	void addGrade(int grade) {
		for (int gradeLegal:gradesLegal) {
			
			if ((gradeLegal == grade) && (gradeIndex + 1 < grades.length)) {
				gradeIndex += 1;
				grades[gradeIndex] = grade;
				
				return;
			}
		}
		
	}
	
}
