package ch08.sec11.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car mycar = new Car();
		
		mycar.run();
		
		mycar.tire1 = new KumhoTire();
		mycar.tire2 = new KumhoTire();
		
		mycar.run();
		

	}

}
