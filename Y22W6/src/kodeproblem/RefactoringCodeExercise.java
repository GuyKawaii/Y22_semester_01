package kodeproblem;

import java.util.Scanner;

public class RefactoringCodeExercise {
  public static void main(String[] args) {

    // Exercise: Refactor code to avoid redundancy
    // If you have extra time: Add a while loop (when should it stop?)

    System.out.print("How much money do you have left? ");
    Scanner scanner = new Scanner(System.in);
    int money = scanner.nextInt();
    int bet;
  	
		while (money > 0) {
			// Betting formats
			System.out.println("You have $" + money + " left.");
			
			if (money < 500) {
				System.out.println("Cash is dangerously low. Bet on crypto carefully.");
			} else if (money < 1000) {
				System.out.println("Cash is somewhat low. Bet on crypto moderately.");
			} else {
				System.out.println("Cash is in good shape. Bet on crypto liberally.");
			}
			
			System.out.print("How much do you want to bet? ");
			bet = scanner.nextInt();
			
			money -= bet;
		}
		
		System.out.printf("Your broke bro you got bogged and the security is here - you are now at: %d and ", money);
		
  }
}
