public class EnigmaPrototype {
	
	public int charToInt01(char c) {
		// converts range [' ', A-Å] to range [0-29]
		if (65 <= c && c <= 90) {
			return (int) c - 64;
		}
		
		switch (c) {
			case ' ' -> {
				return 0;
			}
			case 'Æ' -> {
				return 27;
			}
			case 'Ø' -> {
				return 28;
			}
			default -> { // 'Å'
				return 29;
			}
		}
		
	}
	
	public int charToInt02(char c) {
		// converts range [' ', A-Å] to range [0-29]
		String alphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";
		return alphabet.indexOf(c);
	}
	
	
	public char intToChar01(int charValue) {
		// converts range [0-29] to range [' ', A-Å]
		if (1 <= charValue && charValue <= 26) {
			return (char) (charValue + 64);
		}
		
		switch (charValue) {
			case 0 -> {
				return ' ';
			}
			case 27 -> {
				return 'Æ';
			}
			case 28 -> {
				return 'Ø';
			}
			default -> { // 29
				return 'Å';
			}
		}
		
	}
	
	public char intToChar02(int idx) {
		// converts range [0-29] to range [' ', A-Å]
		String alphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";
		return alphabet.charAt(idx);
	}
	
	public void printTest(char c) {
		boolean isEqual = (c == intToChar02(charToInt02(c)));
		System.out.printf("'%c'   ->   charToInt   '%2d'   ->   intToChar   '%c'   passed: %b\n", c, charToInt02(c), intToChar02(charToInt02(c)), isEqual);
	}
	
	public static void main(String[] args) {
		EnigmaPrototype e = new EnigmaPrototype();
		
		// print test cases
		e.printTest(' ');
		e.printTest('A');
		e.printTest('Z');
		e.printTest('Æ');
		e.printTest('Ø');
		e.printTest('Å');
		
	}
}
