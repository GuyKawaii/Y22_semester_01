package day2;

public class Lamp {
	private Boolean isOn;
	
	Lamp(Boolean isOn){
		this.isOn = isOn;
	}
	
	Lamp(){
		isOn = false;
	}
	
	boolean getState() {
		return isOn;
	}
	
	void pushButton() {
		isOn = !isOn;
	}
	
	@Override
	public String toString() {
		if (isOn) {
			return "on";
		}
		return "off";
	}
}
