package ch16.sec05.exam01;

public class MethodReferenceExample {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		// 정적 메서드 : 클래스명.메서드명
		person.action(Computer :: staticMethod);
		
		
		// 인스턴스 메서드 : 객체 생성후 객체명.메서드명
		Computer computer = new Computer();
		
		person.action(computer::instanceMethod);
		
	}

}
