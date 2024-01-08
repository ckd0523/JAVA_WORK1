package ch08.sec02;

public class Television implements RemoteControl {
	
	@Override			//RemoteControl의 추상메서드 TurnOn 구체적으로 구현
	public void turnOn() {
		System.out.println("티비를 켭니다.");
	}

}
