package bmi;

import java.util.Scanner;
import java.lang.Math;

public class BMICalculator {
	
	public static void main(String[] args) {
		double height;
		double weight;
		double bmi;
		Scanner in = new Scanner(System.in);
		
		// User input
		System.out.println("[Use ',' or '.' as separator depends om your system] - This is a BMI-calculator");
		System.out.print("Input your weight in kg: ");
		weight = in.nextDouble();
		System.out.print("Input your height in meters or cm: ");
		height = in.nextDouble();
		
		// Convert cm to m
		if (height >= 100.0) {
			height = height / 100.0;
		}
		
		bmi = weight / Math.pow(height, 2);
		
		// Assign BMI to group - using scale from https://www.cdc.gov/healthyweight/assessing/index.html
		System.out.printf("You have a BMI of: %.1f", bmi);
		if (bmi < 18.5) {
			System.out.println(" - and that falls within the underweight range.");
		} else if (bmi <= 24.9) {
			System.out.println(" - and that falls within the normal or Healthy Weight range.");
		} else if (bmi <= 29.9) {
			System.out.println(" - and that falls within the overweight range.");
		} else { // (bmi >= 30)
			System.out.println(" - and that falls within the obese range.");
		}
		
	}
}

