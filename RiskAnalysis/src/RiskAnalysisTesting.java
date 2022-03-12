import java.util.Random;

public class RiskAnalysisTesting {
	RiskElement tmpElement;
	Random rnd = new Random();
	
	public void testing() {
		RiskElement[] riskElements = new RiskElement[25];
		RiskAnalysis riskAnalysis = new RiskAnalysis();
		
		for (int i = 0; i < riskElements.length; i++) {
			tmpElement = new RiskElement(("risk: " + i), (rnd.nextInt(5) + 1), (rnd.nextInt(5) + 1));
			riskAnalysis.addElement(tmpElement);
		}
		
		riskAnalysis.sortBySeverity();
		System.out.println(riskAnalysis);
	}
	
	public static void main(String[] args) {
		new RiskAnalysisTesting().testing();
	}
}
