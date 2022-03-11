package day3;

public class method_opg1 {
	double d1 = 1.0;
	double d2 = 30.0;
	double d3 = 1.0;
	
	public double average(double d1, double d2, double d3) {
		return (d1 + d2 + d3) / 3.0;
	}
	
	public void execute() {
		System.out.printf("The average value is: %f", average(d1, d2, d3));
	}
	
	public static void main(String[] args) {
		new method_opg1().execute();
	}
}
