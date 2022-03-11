package day3;

import java.util.Scanner;

public class method_opg2 {
	double d1 = 1.0;
	double d2 = 1.0;
	double d3 = 1.0;
	
	public double smallest(double d1, double d2, double d3) {
		if (d1 <= d2 && d1 <= d3) {
			return d1;
		} else if (d2 <= d1 && d2 <= d3) {
			return d2;
		} else { // (d3 <= d2 && d3 <= d1)
			return d3;
		}
	}
	
	public double getUserNumber() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		return in.nextDouble();
	}
	
	public void execute() {
		d1 = getUserNumber();
		d2 = getUserNumber();
		d3 = getUserNumber();
		System.out.printf("The smallest number is: %f", smallest(d1, d2, d3));
	}
	
	public static void main(String[] args) {
		new method_opg2().execute();
	}
}
