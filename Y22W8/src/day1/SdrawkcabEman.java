package day1;

import java.util.Scanner;

public class SdrawkcabEman {
	String name;
	Scanner in = new Scanner(System.in);
	
	public void sdrawkcabEman() {
		do {
			System.out.print("Please enter your name: ");
			name = in.nextLine();
		} while (name.isEmpty());
		
		System.out.print("I think I got your name backwards, ");
		
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.toUpperCase().charAt(i));
		}
	}
	
	public static void main(String[] args) {
		SdrawkcabEman s = new SdrawkcabEman();
		s.sdrawkcabEman();
		
	}
}
