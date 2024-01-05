package ch07.sec08.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// car 객체내에 tire객체에 어떤 타이어 객체를 넣는 지에 따라 동작이 달라진다.
		
		// car 객체 생성
		Car mycar = new Car();
		// Tire 객체 추가
		mycar.tire = new Tire();						// 내차 타이어에 일반타이어 추가
		mycar.run();
		 
		mycar.tire = new HankookTire();			// 내차 타이어에 한국타이어 추가
		mycar.run();
		mycar.tire = new KumhoTire();			// 내차 타이어에 금호타이어 추가
		mycar.run();

	}

}
