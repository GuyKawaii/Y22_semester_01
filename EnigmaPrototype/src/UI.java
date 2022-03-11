import java.util.Scanner;

public class UI {
	boolean caesarUIRunning;
	boolean mainUIRunning;
	int userSelection;
	String plainText;
	Scanner in = new Scanner(System.in);
	
	
	public void caesarUI() {
		caesarUIRunning = true;
		do {
			System.out.print("""
					\nCaesar
					1) Encrypt
					2) Decrypt
					SELECT:\040""");
			userSelection = Integer.parseInt(in.nextLine());
			
			// encrypt or decrypt
			if (userSelection == 1) {
				System.out.println("\nCaesar encryption");
				System.out.print("input plaintext: ");
				plainText = in.nextLine();
				
				System.out.print("input shift value[0-29]: ");
				plainText = in.nextLine();
				// TODO use Caesar encryption
				
			} else { // userInput == 2 decryption
				System.out.println("\nCaesar decryption");
				System.out.print("input plaintext: ");
				plainText = in.nextLine();
				
				System.out.print("input original shift value[0-29]: ");
				plainText = in.nextLine();
				// TODO use Caesar decryption
			}
			
			// decrypt after encrypt
			if (userSelection == 1) {
				System.out.println("\nCaesar decryption");
				System.out.print("input plaintext: ");
				plainText = in.nextLine();
				
				System.out.print("input original shift value[0-29]: ");
				plainText = in.nextLine();
				// TODO use Caesar decryption
			}
			
			// after menu
			// TODO cant read the exercise description correctly for this entry
			System.out.print("""
					\n1) New code-text
					2) Encrypt
					3) Main menu
					SELECT:\040""");
			userSelection = Integer.parseInt(in.nextLine());
			
			switch (userSelection) {
				case 1 -> System.out.println("1");
				case 2 -> System.out.println("2");
				// case 3
				default -> caesarUIRunning = false;
			}
			
		} while (caesarUIRunning);
	}
	
	public void mainUI() {
		mainUIRunning = true;
		do {
			
			// select protocol
			System.out.print("""
					\n1) Caesar
					2) Vigenère
					3) Number
					0) Exit
					SELECT:\040""");
			userSelection = Integer.parseInt(in.nextLine());
			
			switch (userSelection) {
				default -> { // Caesar - case 1
					caesarUI();
				}
				case 2 -> { // Vigenère
					// TODO add Vigenère UI
				}
				case 3 -> { // Number
					// TODO add Number UI
				}
				case 0 -> {
					mainUIRunning = false;
				}
			}
		} while (mainUIRunning);
		
	}
	
	
	public static void main(String[] args) {
		new UI().mainUI();
//		System.out.println((int) 'Z');
	}
}
