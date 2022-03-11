package day2;

import java.util.Scanner;

public class DaysOfMonth {
	boolean isRunning = true;
	int month;
	int year;
	Scanner in = new Scanner(System.in);
	
	public void daysOfMonth() {
		System.out.println("Give me a number of a month,");
		System.out.println("and i will tell you how many days that number has.\n");
		
		do {
			System.out.print("Number of month (1-12): ");
			month = Integer.parseInt(in.nextLine());
			
			switch (month) {
				case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("That month has 31 days");
				case 4, 6, 9, 11 -> System.out.println("That month has 30 days");
				case 2 -> {
					System.out.print("What year: ");
					year = Integer.parseInt(in.nextLine());
					System.out.println((year % 4 == 0) ? "That month has 29 days" : "That month has 28 days");
				}
				default -> {
					System.out.println("That month has 0 days because that month does not exist.");
					isRunning = false;
				}
			}
		} while (isRunning);
		
	}
	
	public static void main(String[] args) {
		DaysOfMonth d = new DaysOfMonth();
		d.daysOfMonth();
	
	}
}
