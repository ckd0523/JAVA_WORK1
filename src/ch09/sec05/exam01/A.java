package ch09.sec05.exam01;

public class A {

	
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	// 인스턴스 멤버 클래스 (안에 B가 인스턴스 인 경우)
	class B{
		void method() {
			field1=10;
			method1();
			
			field2=10;
			method2();
			
		}
	}
	
	static class C{ // 이 시점에서 class A 외부에 있는 인스턴스 필드와 인스턴스 메서드가 생성이 안될수 있다.
		
		void method() {
		//	field1=10;
		//	method1();
			
			field2=10;
			method2();
			
		}
	}
	
	
}
