package demo;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// init hidden random number
		Random rnd = new Random();
		int hiddenNumber = rnd.nextInt(25 - 1) + 1;

		// game state
		int countTries = 0;
		int userNumber = -1; // not in game guess range

		// user information
		System.out.println("### This is a game where you have to guess the hidden whole number. It's in the range 1-25 ###\n");

		// gameLoop
		while (userNumber != hiddenNumber) {

			// user input
			System.out.print("Give a number: ");
			userNumber = Integer.parseInt(scan.nextLine());
			
			// check number
			if (userNumber == hiddenNumber) {
				System.out.print("You guessed the number " + hiddenNumber);
				
			} else if (userNumber > hiddenNumber) {
				System.out.println("Your number (" + userNumber + ") is [greater] than the hidden number\n");
	
			} else {
				System.out.println("Your number (" + userNumber + ") is [less] than the hidden number\n");
			}
			
			// add given try
			countTries++;
		}
		
		System.out.println(" with " + countTries + " tries");
	}
}