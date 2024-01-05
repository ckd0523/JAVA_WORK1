package ch07.sec03;

public class SmartPhone extends Phone {

	public SmartPhone(String model, String color) {
		super(model,color);		// 부모 생성자 호출 SmartPhone();
//		this.model=model;			// 부모 생성자가 대입을 하기 때문에 할 필요 없다
//		this.color=color;
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
	}
	
}
