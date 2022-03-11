package day4;

public class Test {
	
	public double fact(double n) {
		double sum = 1.0;
		for (double i = 1.0; i <= n; i += 1.0) {
			sum = sum * i;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		Test t = new Test();
		double sum = 0;
		double j = 50;
		double iteration;
		
		
//		double a = (Math.pow(t.fact(i), 2) * Math.pow(2, i + 1)) / (t.fact(2 * i + 1));
		for (int i = 0; i <= j; i++) {
			sum += (Math.pow(t.fact(i), 2) * Math.pow(2, i + 1)) / (t.fact(2 * i + 1));
		}
		System.out.println(sum);
		System.out.println(Math.PI);
	}
}
