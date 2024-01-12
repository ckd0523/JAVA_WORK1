package ch13.sec02.exam02;

public class GenericExample {

	public static void main(String[] args) {
		
		HomeAgency homeAgency = new HomeAgency();	//홈에이젼시 생성
		Home home = homeAgency.rent();							// 에이젼시에서 rent()를 통해 home 객체 생성
		home.turnOnLight();												// home 객체 사용 가능
		
		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.run();

	}

}
