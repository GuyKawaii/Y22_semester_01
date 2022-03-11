package day2;

import java.util.Arrays;

public class DiceTest {
	public static void main(String[] args) {
		Dice d1 = new Dice();
		int[] values = new int[7];
		
		for (int i = 0; i < 100; i++) {
			
			d1.roll();
			
			if (1 <= d1.getFaceValue() && d1.getFaceValue() <= 6) {
				values[d1.getFaceValue()] += 1;
				
			} else { // for all values outside [1-6]
				values[0] += 1;
			}
		}
		
		// test if dice rolls within range
		if (values[0] > 0) {
			System.out.println("Error in range rolled " + values[0] + " values outside range [1-6]");
		}
		
		// histogram of dice rolls
		for (int i = 1; i < values.length; i++) {
			System.out.println(i + " rolled " + values[i]);
		}
		
	}
}
