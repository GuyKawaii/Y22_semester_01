package day2;

import java.util.Random;

public class Dice {
	private int faceValue;
	Random rnd = new Random();
	
	Dice() {
		faceValue = 1;
	}
	
	int getFaceValue() {
		return faceValue;
	}
	
	void roll() {
		faceValue = rnd.nextInt(6) + 1;
	}
}
