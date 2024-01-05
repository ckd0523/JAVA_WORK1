package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Phone myphone = new Phone("홍길동"); // phone클래스가 추상클래스이기 때문에 객체 생성 불가
		
		SmartPhone smartphone = new SmartPhone("홍길동");
		
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
		

	}

}
