package ch07.sec04;

public class SupersonicAplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NOMAL;
		sa.fly();
		sa.land();
		
		
		
		
		
	}

}
