package day2;

public class LampTest {
	public static void main(String[] args) {
		
		Lamp deskLamp2 = new Lamp();
		Lamp bedsideLamp = new Lamp(true);
		Lamp deskLamp1 = new Lamp(true);
		
		Lamp[] lamps = new Lamp[3];
		lamps[0] = deskLamp1;
		lamps[1] = deskLamp2;
		lamps[2] = bedsideLamp;
		
		System.out.print("deskLamp1 " + deskLamp1 + ", ");
		System.out.print("deskLamp2 " + deskLamp2 + ", ");
		System.out.print("bedsideLamp " + bedsideLamp);
		
		for (Lamp l:lamps) {
			l.pushButton();
		}
		
		System.out.println("\n\nNew lamp values");
		System.out.print("deskLamp1 " + deskLamp1 + ", ");
		System.out.print("deskLamp2 " + deskLamp2 + ", ");
		System.out.print("bedsideLamp " + bedsideLamp);
		
		
	}
}
