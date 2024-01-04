package ch06.exam03.package1;

public class A {
	// 필드 선언
	public int field1; // public : 모든곳에서 사용가능
	int field2; // default : 같은 패키지 내에서 사용가능
	private int field3; // private : 같은 클래스 내에서 사용가능
	
	// 생성자 선언
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;

		method1();
		method2();
		method3();

	}
	
	// 매서드 선언
	public void method1() {//모든 곳에서 사용가능한 매서드 ,void : 리턴값이 없다
		
	}

	void method2() {//같은 패키지 내에서 사용가능한 매서드

	}

	private void method3() {//같은 클래스 안에서 사용가능한 매서드 (어디에서 매서드 호출? 다른 매서드내에서 호출)
	
}

}
