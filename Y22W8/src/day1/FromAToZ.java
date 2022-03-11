package day1;

public class FromAToZ {
	public void fromAToZ(){
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c);
		}
		System.out.println();
		for (char c = 'Z'; c >= 'A'; c--) {
			System.out.print(c);
		}
	}
	
	public static void main(String[] args) {
		FromAToZ f = new FromAToZ();
		f.fromAToZ();
	}
}
