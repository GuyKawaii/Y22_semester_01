package simpleblackjack;

import java.util.Random;
import java.util.Scanner;

public class SimpleBlackJack {
	public static void main(String[] args) {
		int playerSum = 0;
		int dealerSum = 0;
		int newCard;
		String userInput;
		Random rnd = new Random();
		Scanner in = new Scanner(System.in);
		
		
		boolean isPlaying = true;
		while (isPlaying) {
			
			System.out.print("Stop drawing card [y]es or [Enter] to continue: ");
			userInput = in.nextLine();
			// User stops rounds
			if (userInput.equals("y")) {
				isPlaying = false;
				
				// player and dealer draws
			} else {
				
				// Player draws card
				newCard = (rnd.nextInt(13) + 1);
				playerSum += Math.min(newCard, 10);
				System.out.printf("   You drew: %d\t  your total is now: %d\n", newCard, playerSum);
				
				// Dealer draws card
				if (playerSum < 21 && dealerSum <= 17) {
					newCard = (rnd.nextInt(13) + 1);
					dealerSum += Math.min(newCard, 10);
					System.out.printf("dealer drew: %d\tdealer total is now: %d\n", newCard, dealerSum);
				}
				
				// Separate rounds
				System.out.println();
			}
			
			// ending game by win or loss
			if (playerSum >= 21 || dealerSum >= 21) {
				isPlaying = false;
			}
		}
		
		// dealer draws until he catches up
		while ((dealerSum < playerSum) && (playerSum <= 21) && (dealerSum < 21)) {
			
			// Dealer draws card
			newCard = (rnd.nextInt(13) + 1);
			dealerSum += Math.min(newCard, 10);
			System.out.printf("dealer drew: %d\tdealer total is now: %d\n", newCard, dealerSum);
		}
		
		// --- Assign wins and losses ---
		System.out.printf("\nEndgame stats:\nPlayer: %d\nDealer: %d\n", playerSum, dealerSum);
		// Even
		if (playerSum == dealerSum) {
			System.out.println("Even");
		}
		// Under 21 points
		// Player wins
		else if (playerSum == 21) {
			System.out.println("Player blackjack");
		} else if (playerSum > dealerSum && playerSum < 21) {
			System.out.println("Player wins");
		}
		// Dealer wins
		else if (dealerSum == 21) {
			System.out.println("Dealer blackjack");
		} else if (dealerSum > playerSum && dealerSum < 21) {
			System.out.println("Dealer wins");
		}
		// over 21 points
		else if (playerSum > 21 && dealerSum > 21) {
			System.out.println("Dealer wins");
		} else if (dealerSum > 21) {
			System.out.println("Player wins");
		} else {
			System.out.println("Dealer wins");
		}
		
		
	}
	
	
}
	

