package strengeleg;

import java.util.Scanner;

public class StringMethods {
	public static void main(String[] args) {
		// Opret to String-variabler, str1 og str2 og en Scanner
		String str2;
		String str1;
		Scanner in = new Scanner(System.in);
		
		// Bed brugeren indtaste to tekststrenge til str1 hhv. str2
		System.out.print("Input str1: ");
		str1 = in.nextLine();
		System.out.print("Input sr2: ");
		str2 = in.nextLine();
		
		// Print string methods
		System.out.println("First char of str1: " + str1.charAt(0));
		System.out.println("Number of chars in str1: " + str1.length());
		System.out.println("Last char of str1: " + str1.charAt(str1.length() - 1));
		System.out.println("str1 is equal to str2: " + str1.equals(str2));
		System.out.println("str1 compared to str2: " + str1.compareTo(str2));
		System.out.println("concatenation of str1 and str2: " + str1.concat(str2));
		System.out.println("str1 contains str2: " + str1.contains(str2));
		System.out.println("str1 as all-upper-case: " + str1.toUpperCase());
		System.out.println("str1 as all-lower-case: " + str1.toLowerCase());
		System.out.println("str1 without leading or trailing spaces: [" + str1.trim() + "]");
		System.out.println("str1 from character number 2 and onwards: " + str1.substring(1));
		System.out.println("str1 from character number 2 to 3 (both included) [assuming real position and not index]: " + str1.substring(1, 3));
		
		
	}
}
