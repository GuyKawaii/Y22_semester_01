package scannermethods;

import java.util.Scanner;

public class ScannerMethods {
	public static void main(String[] args) {
		String name;
		int yearOfBirth;
		double bmi;
		boolean hasDriversLicense;
		char gender;
		Scanner in = new Scanner(System.in);
		
		// User input
		System.out.print("Enter name: ");
		name = in.nextLine();
		
		System.out.print("Enter year of birth: ");
		yearOfBirth = in.nextInt();
		in.nextLine();
		
		System.out.print("Enter bmi: ");
		bmi = in.nextDouble();
		in.nextLine();
		
		System.out.print("Enter has drivers license(true/false ): ");
		hasDriversLicense = in.nextBoolean();
		in.nextLine();
		
		System.out.print("Enter gender(m or f): ");
		gender = in.nextLine().charAt(0);
		
		// Print user input
		System.out.println("Your informationname\n");
		System.out.printf("name: %s\n", name);
		System.out.printf("year of birth: %d\n", yearOfBirth);
		System.out.printf("bmi: %f\n", bmi);
		System.out.printf("Has drivers license: %b\n", hasDriversLicense);
		System.out.printf("Gender: %c\n", gender);
		
	}
}
