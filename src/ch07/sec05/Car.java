package ch07.sec05;

public class Car {

	public int speed;
	
	public void speedUp() {
		speed +=0;
		
	}
	public final void stop() {
		System.out.println("차를 멈춤");
		speed=0;
	}
	
	
}
