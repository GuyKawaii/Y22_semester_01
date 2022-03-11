package trafficLight;

public class TrafficLightTest {
	public void testing() {
		TrafficLight t1 = new TrafficLight(Color.RED);
		System.out.println(t1.getTrafficLightColor());
		
		t1.setTrafficLightColor(Color.YELLOW);
		System.out.println(t1.getTrafficLightColor());
		t1.setTrafficLightColor(Color.GREEN);
		System.out.println(t1.getTrafficLightColor());
		t1.setTrafficLightColor(Color.RED);
		System.out.println(t1.getTrafficLightColor());
	}
	
	public static void main(String[] args) {
		TrafficLightTest t = new TrafficLightTest();
		t.testing();
//		new TrafficLightTest().testing();
	}
}
