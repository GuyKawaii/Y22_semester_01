package receiptprinter;

public class ReceiptPrinter {
	public static void main(String[] args) {
		// User details
		int uniqueNumber = 20000;
		String date = "feb 7, 2022";
		String name = "Cash the ripper";
		double amount = 12234.75;
		String methodOfPayment = "Credit card";
		String signature = "M. Anager";
		
		// Print receipt
		System.out.printf("[%s]\n", "-".repeat(62));
		
		System.out.printf("| %-20s%40s |\n", "Your receipt", ("Unique number: " + uniqueNumber));
		System.out.printf("| %60s |\n", ("Date: " + date));
		System.out.printf("| %s |\n", " ".repeat(60));
		
		System.out.printf("| %-10s%50s |\n", "name: ", name);
		System.out.printf("| %-10s%50s |\n", "Amount: ", amount);
		System.out.printf("| %-20s%40s |\n", "Method of payment: ", methodOfPayment);
		System.out.printf("| %s |\n", " ".repeat(60));
		
		System.out.printf("| %60s |\n", signature);
		System.out.printf("[%s]\n", "-".repeat(62));
		
	}
}
