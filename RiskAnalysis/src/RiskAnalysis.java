import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RiskAnalysis {
	private ArrayList<RiskElement> riskElements = new ArrayList<>();
	
	RiskAnalysis() {
		// N/A
	}
	
	void addElement(RiskElement element) {
		riskElements.add(element);
	}
	
	void sortBySeverity() {
		riskElements.sort(Comparator.comparing(RiskElement::getSeverity));
		Collections.reverse(riskElements);
	}
	
	@Override
	public String toString() {
		StringBuilder returnStr = new StringBuilder();
		
		// header
		returnStr.append(String.format("%-5s %-50s  %4s %4s %4s  %s\n",
				"Num.",
				"Risk name",
				"Pro",
				"Con",
				"Sev",
				"Level"));
		
		// add riskElements
		for (int index = 0; index < riskElements.size(); index++)
			returnStr.append(String.format("#%2d  '%-50s' %3d| %3d| %3d|  %s\n",
					(index + 1),
					riskElements.get(index).getDescription(),
					riskElements.get(index).getProbability(),
					riskElements.get(index).getConsequence(),
					riskElements.get(index).getSeverity(),
					riskElements.get(index).getRiskLevelStrColored()));
		
		return returnStr.toString();
	}
	
}
