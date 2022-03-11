package day1;

import java.util.Scanner;

public class YouMustAnswer {
	boolean isRunning = true;
	String name;
	Scanner in = new Scanner(System.in);
	
	public void youMustAnswer() {
		do {
			System.out.print("Enter your name: ");
			name = in.nextLine();
			
			if (name.isBlank())
				System.out.println("You MUST enter your name");
			else
				isRunning = false;
			
		} while (isRunning);
		System.out.println("Thank you, " + name);
		
	}
	
	public static void main(String[] args) {
		YouMustAnswer yma = new YouMustAnswer();
		yma.youMustAnswer();
	
	}
}
