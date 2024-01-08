package ch09.sec02.exam01;

public class A {
	
	// 인스턴트 멤버 클래스
	class B{}
	// 인스턴트 필드 값으로 B 객체 대입
	B field = new B();
	
	A(){
		B b =new B();
	}
	
	void method() {
		B b = new B();
	}

}
