package day2;

import java.util.Scanner;

public class NameThatDay {
	Scanner in = new Scanner(System.in);
	boolean isRunning = true;
	int day = 0;
	
	public void nameThatDay() {
		do {
			System.out.print("Enter day of the week (1-7): ");
			day = Integer.parseInt(in.nextLine());
			
			switch (day) {
				case 1 -> System.out.println("I call that Monday");
				case 2 -> System.out.println("I call that Tuesday");
				case 3 -> System.out.println("I call that Wednesday");
				case 4 -> System.out.println("I call that Thursday");
				case 5 -> System.out.println("I call that Friday");
				case 6 -> System.out.println("I call that Saturday");
				case 7 -> System.out.println("I call that Sunday");
				default -> {
					System.out.println("I call that Unknown day");
					isRunning = false;
				}
			}
			
		} while (isRunning);
		
	}
	
	public static void main(String[] args) {
		NameThatDay n = new NameThatDay();
		n.nameThatDay();
	
	}
}
