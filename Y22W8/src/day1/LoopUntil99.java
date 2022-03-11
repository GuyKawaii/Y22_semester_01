package day1;

import java.util.Scanner;

public class LoopUntil99 {
	Scanner in = new Scanner(System.in);
	int num;
	
	public void loopUntil99() {
		while (num != 99) {
			System.out.print("Enter a number (99 to quit) ");
			num = Integer.parseInt(in.nextLine());
			System.out.println("You entered " + num);
		}
		
	}
	
	public static void main(String[] args) {
		LoopUntil99 l = new LoopUntil99();
		l.loopUntil99();
	}
}
