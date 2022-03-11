package kodeproblem;

import java.util.Scanner;

public class ScoreProblemExercise {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("What percentage did you earn? ");
		int percent = scanner.nextInt();
		
		if (percent >= 90) {
			System.out.println("You got an A!");
		} else if (percent >= 80) {
			System.out.println("You got a B!");
		} else if (percent >= 70) {
			System.out.println("You got a C!");
		} else if (percent >= 60) {
			System.out.println("You got a D!");
		} else { // (percent < 60)
			System.out.println("You got an F!");
		}
		
	}
}
