package day1;

import java.util.Scanner;

public class FindLargestNumber {
	Scanner in = new Scanner(System.in);
	
	public int getUserInput() {
		System.out.print("Enter whole number: ");
		return Integer.parseInt(in.nextLine());
	}
	
	public int findLargestNumber(int num1, int num2) {
		return Math.max(num1, num2);
	}
	
	public void displayLargestNumber(int num) {
		System.out.println("The largest number: " + num);
	}
	
	
	public static void main(String[] args) {
		FindLargestNumber f = new FindLargestNumber();
		
		int number1 = f.getUserInput();
		int number2 = f.getUserInput();
		
		int largest = f.findLargestNumber(number1, number2);
		f.displayLargestNumber(largest);
		
	}
}
