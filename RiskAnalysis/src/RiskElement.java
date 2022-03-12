public class RiskElement {
	private String description;
	private int probability;
	private int consequence;
	private int severity;
	private RiskLevel riskLevel;
	
	RiskElement(String description, int probability, int consequence) {
		setDescription(description);
		setProbability(probability);
		setConsequence(consequence);
		updateSeverityAndRiskLevel();
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getProbability() {
		return probability;
	}
	
	public int getConsequence() {
		return consequence;
	}
	
	public int getSeverity() {
		return severity;
	}
	
	public RiskLevel getRiskLevel() {
		return riskLevel;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setProbability(int probability) {
		this.probability = probability;
		updateSeverityAndRiskLevel();
	}
	
	public void setConsequence(int consequence) {
		this.consequence = consequence;
		updateSeverityAndRiskLevel();
	}
	
	private void updateSeverityAndRiskLevel() {
		severity = probability * consequence;
		
		// Assign riskLevel
		if (severity <= 5) {
			riskLevel = RiskLevel.VERY_LOW;
		} else if (severity <= 10) {
			riskLevel = RiskLevel.LOW;
		} else if (severity <= 15) {
			riskLevel = RiskLevel.MEDIUM;
		} else if (severity <= 20) {
			riskLevel = RiskLevel.HIGH;
		} else { // (severity <= 20)
			riskLevel = RiskLevel.VERY_HIGH;
		}
	}
	
	public String getRiskLevelStrColored() {
		// Add severity color
		switch (riskLevel) {
			case VERY_LOW, LOW -> {
				return Colors.ANSI_GREEN + riskLevel + Colors.ANSI_BLACK;
			}
			case MEDIUM -> {
				return Colors.ANSI_YELLOW + riskLevel + Colors.ANSI_BLACK;
			}
			case HIGH, VERY_HIGH -> {
				return Colors.ANSI_RED + riskLevel + Colors.ANSI_BLACK;
			}
			default -> throw new IllegalStateException("Unexpected value: " + riskLevel);
		}
	}
	
	@Override
	public String toString() {
		return String.format("'%-50s' %3d| %3d| %3d|  ", description, probability, consequence, severity) +
				getRiskLevelStrColored();
	}
	
}
