package day4;

import java.util.Random;
import java.util.Scanner;

public class LineWars {
	int playerLocation = -8;
	int enemyLocation = 8;
	int playerSoldierCount = 25;
	int enemySoldierCount = 25;
	int playerFirepower = 2500;
	int enemyFirepower = 2500;
	int useFirepower;
	int killedSoldiers;
	int enemyEntropy;
	String enemyState;
	String playerAction = "None";
	Random rnd = new Random();
	int dice;
	Scanner in = new Scanner(System.in);
	
	public int distance() {
		return Math.abs(playerLocation - enemyLocation);
	}
	
	public int damage(int soldierCount, int location1, int location2) {
		// calculate numbers of soldiers damaged(6-0) in firefight based on distance between players
		int potentialDamage = Math.max(0, 6 - Math.abs(location1 - location2));
		
		return soldierCount - Math.max(0, soldierCount - potentialDamage);
	}
	
	public int move(char stepDirection, int numOfSteps, int currentLocation) {
		// used to return random number of steps within range[maxStep-minStep] in a given direction based on stepDirection.
		// Given steps will always result in new position within the game-board
		
		int steps = numOfSteps;
		int newPosition;
		
		if (stepDirection == '-') {
			steps = -steps;
		}
		
		newPosition = currentLocation + steps;
		
		// keep steps in game-board
		if (newPosition < -10) {
			return -10 - currentLocation;
			
		} else if (newPosition > 10) {
			return 10 - currentLocation;
			
		} else {
			return steps;
		}
		
	}
	
	public boolean scout(int scoutPosition, int targetLocation, char homeLocation, String targetName) {
		// Print scout message according to where target is in relation to scout. Scout can see further in direction of home.
		
		if (homeLocation == '-') {
			if (targetLocation < scoutPosition && Math.abs(targetLocation - scoutPosition) <= 3) {
				System.out.printf(" * Our Scout has spotted %s |%d| positions behind us!\n", targetName, Math.abs(targetLocation - scoutPosition));
				return true;
				
			} else if (targetLocation >= scoutPosition && Math.abs(targetLocation - scoutPosition) <= 2) {
				System.out.printf(" * Our Scout has spotted %s |%d| positions in front us!\n", targetName, Math.abs(targetLocation - scoutPosition));
				return true;
			}
			
		} else { // homeLocation == '+'
			if (targetLocation > scoutPosition && Math.abs(targetLocation - scoutPosition) <= 3) {
				System.out.printf(" * Our Scout has spotted %s |%d| positions behind us!\n", targetName, Math.abs(targetLocation - scoutPosition));
				return true;
				
			} else if (targetLocation <= scoutPosition && Math.abs(targetLocation - scoutPosition) <= 2) {
				System.out.printf(" * Our Scout has spotted %s |%d| positions in front us!\n", targetName, Math.abs(targetLocation - scoutPosition));
				return true;
			}
		}
		
		return false;
		
	}
	
	public void playerTurn() {
		// enables free action or onetime action
		while (playerAction.equals("None") || playerAction.equals("p")) {
			
			// player choose action
			System.out.print("\n- Choose your move? [f]orward, [b]ackwards, [a]ttack or [p]rint game-board for free: ");
			playerAction = in.nextLine();
			
			// enable free selection
			if (playerAction.equals("p")) {
				printBoard(distance() <= 2); // keep simpler check
			}
		}
		
		switch (playerAction) {
			case "f" -> {
				dice = (rnd.nextInt(2) + 1);
				playerLocation += move('+', dice, playerLocation);
				System.out.printf(" * Player rolled (%d) and is now at position: |%d|\n", dice, playerLocation);
				
				printBoard(scout(playerLocation, enemyLocation, '-', "the Enemy"));
			}
			
			case "b" -> {
				dice = (rnd.nextInt(3) + 1);
				playerFirepower = Math.min(2500, playerFirepower + 250 * dice);
				playerLocation += move('-', dice, playerLocation);
				System.out.printf(" * Player rolled (%d) and got (%d) x 250 new firepower as he moved back and is now at position: |%d|\n", dice, dice, playerLocation);
				System.out.printf("    currently has (%d) firepower\n", playerFirepower);
				
				printBoard(scout(playerLocation, enemyLocation, '-', "the Enemy"));
			}
			
			case "a" -> {
				dice = (rnd.nextInt(6) + 1);
				useFirepower = 100 * dice;
				System.out.printf(" * Player rolled (%d) and therefore has to use (%d) firepower to do damage\n    currently has (%d) firepower\n", dice, useFirepower, playerFirepower);
				
				// enough firepower
				if (playerFirepower - useFirepower >= 0) {
					playerFirepower -= useFirepower;
					
					killedSoldiers = damage(enemySoldierCount, playerLocation, enemyLocation);
					enemySoldierCount -= killedSoldiers;
					
					// attack within range
					if (distance() >= 6) {
						System.out.println(" * Player soldiers attack but kills none of the enemies soldiers as the distance to them is 6 or more\n");
					} else {
						System.out.printf(" * Player soldiers attacks and kills //%d// of the enemies soldiers as the distance to them is |%d|\n", killedSoldiers, distance());
						System.out.printf("    The enemy now has //%d// soldiers\n", enemySoldierCount);
					}
					
				} else {
					System.out.println(" * Not enough firepower");
				}
			}
			
		}
		
		// reset playerAction
		playerAction = "None";
		
	}
	
	public void enemyTurn() {
		enemyEntropy = rnd.nextInt(100);
		
		// enemy does random things
		// When close to player
		if (distance() < 6) {
			if (enemyEntropy <= 45) {
				enemyState = "a";
			} else if (enemyEntropy <= 60) {
				enemyState = "f";
			} else if (enemyEntropy <= 70) {
				enemyState = "b";
			} else if (playerLocation < enemyLocation) {
				enemyState = "f";
			} else {
				enemyState = "b";
			}
			// when far away from player
		} else {
			if (distance() >= 6) {
				if (enemyEntropy <= 10) {
					enemyState = "a";
				} else if (enemyEntropy <= 80) {
					enemyState = "f";
				} else {
					enemyState = "b";
				}
			}
		}
		
		switch (enemyState) {
			case "f" -> {
				dice = (rnd.nextInt(2) + 1);
				enemyLocation += move('-', dice, enemyLocation);
				System.out.printf(" * Player rolled (%d) and is now at position: |%d|\n", dice, enemyLocation);
				
				if (scout(playerLocation, enemyLocation, '-', "the Enemy")) {
					printBoard(true);
				}
			}
			
			case "b" -> {
				enemyFirepower = Math.min(2500, enemyFirepower + 250);
				dice = (rnd.nextInt(3) + 1);
				enemyLocation += move('+', dice, enemyLocation);
				System.out.printf(" * Enemy rolled (%d) and got (%d) x 250 new firepower as he moved back and is now at position: |%d|\n", dice, dice, enemyLocation);
				// Player rolled (%d) and got (%d) x 250 new firepower as he moved back and is now at position: |%d|\n", dice, dice,
				if (scout(playerLocation, enemyLocation, '-', "the Enemy")) {
					printBoard(true);
				}
			}
			case "a" -> {
				dice = (rnd.nextInt(6) + 1);
				useFirepower = 100 * dice;
				System.out.printf(" * Enemy  rolled (%d) to attack and therefore has to use (%d) firepower to do damage\n    currently has (%d) firepower\n", dice, useFirepower, playerFirepower);
				
				
				// is enough firepower
				if (enemyFirepower - useFirepower >= 0) {
					enemyFirepower -= useFirepower;
					
					
					killedSoldiers = damage(playerSoldierCount, playerLocation, enemyLocation);
					playerSoldierCount -= killedSoldiers;
					
					if (distance() >= 6) {
						System.out.println(" * Enemy soldiers attack but kills none of the players soldiers as the distance to them is 6 or more\n");
					} else {
						System.out.printf(" * Enemy soldiers attacks and kills //%d// of the players soldiers as the distance to them is |%d|\n", killedSoldiers, distance());
						System.out.printf("    The player now has //%d// soldiers\n", playerSoldierCount);
					}
					
				} else {
					System.out.println(" * Enemy does not have enough firepower");
				}
			}
		}
		
	}
	
	public void SetupGame() {
		// print game-rules
		System.out.println(" ".repeat(29) + "- - L I N E  -  \\\\/\\\\/ A R S - -");
		printBoard(true);
		
		System.out.println("\nThe rules are as follows:");
		System.out.println("- This is a One-dimensional game-board with 21 fields [-10..10] where the players base is -10 and the enemies is 10");
		System.out.println("- Win by Killing all the soldiers of the enemy or plant a bomb in enemy base.");
		System.out.println("- Each one starts with 25 soldiers and 2500 firepower");
		System.out.println("- Firepower is used each time you attack");
		System.out.println("- Most actions has some random element by rolling a dice");
		System.out.println("- You can take one of 4 actions each turn");
		System.out.print("[Enter] to start: ");
		in.nextLine();
		System.out.println("\n");
		
		// --- players roll dice ---
		// player start
		dice = (rnd.nextInt(6) + 1);
		playerLocation = -11 + dice;
		System.out.printf("Player rolled (%d) and is at position: |%3d|\n", dice, playerLocation);
		
		// enemy start
		dice = (rnd.nextInt(6) + 1);
		enemyLocation = 11 - dice;
		System.out.printf("Enemy  rolled (%d) and is at position: |%3d|\n", dice, enemyLocation);
		
		printBoard(true);
		
		// --- Main game loop ---
		boolean isPlaying = true;
		while (isPlaying) {
			
			playerTurn();
			if (playerLocation == 10 || enemyLocation == -10 || playerSoldierCount <= 0 || enemySoldierCount <= 0) {
				isPlaying = false;
			}
			enemyTurn();
			if (playerLocation == 10 || enemyLocation == -10 || playerSoldierCount <= 0 || enemySoldierCount <= 0) {
				isPlaying = false;
			}
		}
		
		// Assign win or loss
		if (playerLocation == 10) {
			System.out.println("\n\nThe Player Wins");
		} else if (enemyLocation == -10) {
			System.out.println("\n\nThe Enemy Wins");
		} else if (enemySoldierCount <= 0) {
			System.out.println("\n\nThe Player Wins");
		} else { // playerSoldierCount <= 0
			System.out.println("\n\nThe Enemy Wins");
		}
		
		printBoard(true);
		
	}
	
	public void printBoard(boolean seeEnemy) {
		// print board with or without enemy-icon
		System.out.print("|");
		// print 1. line and assign symbols
		for (int i = -10; i <= 10; i++) {
			if (i == playerLocation) {
				if (i == enemyLocation) {
					System.out.print(" X |");
				} else {
					System.out.print(" P |");
				}
				
			} else if (i == enemyLocation && seeEnemy) {
				System.out.print(" E |");
			} else if (i == -10) {
				System.out.print("-10|");
			} else if (i == 0) {
				System.out.print(" 0 |");
			} else if (i == 10) {
				System.out.print(" 10|");
			} else {
				System.out.print("   |");
			}
		}
		// print 2. line and assign symbols
		for (int i = -10; i <= 10; i++) {
			if (i == -10) {
				System.out.print("\n| >  ");
			} else if (i == 0) {
				System.out.print(" |  ");
			} else if (i == 10) {
				System.out.print(" < |");
			} else {
				System.out.printf("%+d  ", i);
			}
		}
		
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		LineWars game = new LineWars();
		game.SetupGame();
		
	}
}
