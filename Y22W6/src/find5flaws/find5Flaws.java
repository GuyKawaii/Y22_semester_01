package find5flaws;

import java.util.Random;
import java.util.Scanner;

public class find5Flaws {
	public static void main(String[] args) {
		// Uncomment blocks to test

//		// 1 - add 1 to "random.nextInt(6)"
//		Random random = new Random();
//		int randomNumber = random.nextInt(6) + 1;
//		System.out.println(randomNumber);

//		// 2 - changed place of count++
//		int count01 = 0;
//		count01++;
//		System.out.println(count01++);

//		// 3 - removed ;
//		int count02 = 5;
//		if (count02 >= 10) {
//			System.out.println("Tal er større eller lig med 10");
//		}

//		// 4 - casted to double
//		int number1 = 50;
//		int number2 = 7;
//		double resultat = (double) number1/number2;
//		if (resultat > 7) {
//			System.out.println("Resultat større end 7");
//		}

//		// 5 - changed = to ==
//		int number = 10;
//		if (number == 10) {
//			System.out.println("Variablen number indeholder værdien 10");
//		}
		
		// ### IMPORTED CODE ###
		// ### IMPORTED CODE ###
		// ### IMPORTED CODE ###
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
		while (userNumber == hiddenNumber) {
			
			// user input
			System.out.print("Give a number: ");
			userNumber = Integer.parseInt(scan.nextLine());
			
			// check number
			if (userNumber == hiddenNumber) {
				System.out.print("You guessed the number " + hiddenNumber);
				
			} else if (userNumber > hiddenNumber) {
				System.out.println("Your number (" + userNumber + ") is [greater] than the hidden number\n");
				
			} else; {
				System.out.println("Your number (" + userNumber + ") is [less] than the hidden number\n");
			}
			
			// add given try
			countTries++;
		}
		
		System.out.println(" with " + countTries + " tries");
		// ### IMPORTED CODE ###
		// ### IMPORTED CODE ###
		// ### IMPORTED CODE ###
	}
}

		

