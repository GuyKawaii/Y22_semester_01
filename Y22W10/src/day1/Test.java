package day1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;

public class Test {
	public static void main(String[] args) {
		Kid[] kids = new Kid[5];
		
		Kid k0 = new Kid("Ovuvueve-Vue-Eñetueñe-Vue-Obemubem-osass", 2002);
		kids[0] = k0;
		
		Kid k1 = new Kid("Jens", 2003);
		kids[1] = k1;
		
		Kid k2 = new Kid("Teddy", 2005);
		kids[2] = k2;
		
		Kid k3 = new Kid("Albert", 1980);
		kids[3] = k3;

		Kid k4 = new Kid("Frank", 2002);
		kids[4] = k4;

		// printing kids using toString
		for (Kid k : kids) {
			System.out.println(k);
		}
		
		// printing kids age and name
		System.out.println();
		for (Kid k : kids) {
			System.out.println(k.getName() + "\tis:\t" + (LocalDate.now().getYear() - k.getYearOfBirth()) + "\tyears old");
		}
		
	}
}
