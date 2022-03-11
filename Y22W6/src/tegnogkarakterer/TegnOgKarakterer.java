package tegnogkarakterer;

import java.util.Scanner;

public class TegnOgKarakterer {
	public static void main(String[] args) {
		String name;
		Scanner in = new Scanner(System.in);
		
		// User input
		System.out.print("Skriv dit navn (fornavn og efternavn): ");
		name = in.nextLine();
		int spaceIdx = name.indexOf(" ");
		
		// print name formats
		System.out.println("\n1.  Fulde navn: " + name);
		System.out.println("2.  Navnet uden mellemrum: " + name.replace(" ", ""));
		System.out.printf("3.  Forbogstav og efternavn: %s.%s\n", name.charAt(0), name.substring(spaceIdx));
		System.out.printf("4.  Initialer: %s%s\n", name.charAt(0), name.charAt(spaceIdx + 1));
		
		System.out.println("5.  Fornavn og efternavn pænt under hinanden:");
		System.out.printf("    %-15s%s\n", "Fornavn:", name.substring(0, spaceIdx));
		System.out.printf("    %-15s%s\n", "Efternavn:", name.substring(spaceIdx + 1));
		
		System.out.printf("6.  Efternavn komma fornavn: %s, %s\n", name.substring(0, spaceIdx), name.substring(spaceIdx + 1));
		System.out.printf("7.  Fulde navn i anførselstegn: \"%s\"\n", name);
		System.out.printf("8.  Fulde navn i apostroffer: \'%s\'\n", name);
		System.out.printf("9.  Fornavn uden første og sidste bogstav: %s\n", name.substring(1, spaceIdx - 1));
		System.out.printf("10. Første og sidste bogstav i efternavn: %s%s\n", name.charAt(spaceIdx + 1), name.charAt(name.length() - 1));
		
		
	}
}



