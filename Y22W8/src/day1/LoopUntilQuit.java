package day1;

import java.util.Scanner;

public class LoopUntilQuit {
	String userInput;
	boolean isRunning = true;
	
	Scanner in = new Scanner(System.in);
	
	public void loopUntilQuit() {
		do {
			System.out.print("Enter text or \"quit\", \"Quit\", \"QUIT\", \"quIT\", \"QuIt\": ");
			userInput = in.nextLine();
			
			System.out.println("You entered " + userInput);
			
			if (userInput.equalsIgnoreCase("quit"))
				isRunning = false;
			
		} while (isRunning);
		
	}
	
	public static void main(String[] args) {
		LoopUntilQuit l = new LoopUntilQuit();
		l.loopUntilQuit();
	}
}
