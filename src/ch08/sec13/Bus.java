package ch08.sec13;

public class Bus implements Vehicle {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFare() {
		System.out.println("승차요금을 체크 합니다.");
	}

}
