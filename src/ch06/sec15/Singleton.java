package ch06.sec15;


//class 는 대문자로 시작
//객체 변수는 소문자로 시작

public class Singleton {

	private static Singleton singleton =new Singleton();
	
	private Singleton() {
		
	}
	
	static Singleton getInstance() {
		return singleton;
	}
	
	
}
