package trafficLight;

public class TrafficLight {
	private Color TrafficLightColor;
	
	TrafficLight(Color color) {
		setTrafficLightColor(color);
	}
	
	Color getTrafficLightColor() {
		return TrafficLightColor;
	}
	
	void setTrafficLightColor(Color color) {
		TrafficLightColor = color;
	}
	
}
