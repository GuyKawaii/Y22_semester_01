package tommeberegner;

import java.util.Scanner;

public class TommeBeregner {
	
	public static void main(String[] args) {
		final double CM_PER_INCH = 2.54;
		double inches;
		Scanner in = new Scanner(System.in);
		
		System.out.print("[use ',' or '.' as separator depends on system] - Input a length in inches: ");
		inches = in.nextDouble();
		
		System.out.println(inches + " inches are equal to " + inches * CM_PER_INCH + " centimeters");
	}
}
