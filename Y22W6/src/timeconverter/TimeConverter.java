package timeconverter;

import java.util.Scanner;

public class TimeConverter {
	public static void main(String[] args) {
		int totalSeconds;
		int sec;
		int min;
		int hour;
		final int SEC_PER_MIN = 60;
		final int SEC_PER_HOUR = 60 * 60;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter total number of seconds: ");
		totalSeconds = in.nextInt();
		sec = totalSeconds; // remaining seconds
		
		// Remove hours
		hour = sec / SEC_PER_HOUR;
		sec = sec % SEC_PER_HOUR;
		// Remove minutes
		min = sec / SEC_PER_MIN;
		sec = sec % SEC_PER_MIN;
		
		// print user time
		System.out.printf("%d Seconds are equal to:\n", totalSeconds);
		System.out.println("Hour: " + hour);
		System.out.println(" min: " + min);
		System.out.println(" sec: " + sec);
		
		
	}
}
