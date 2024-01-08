package ch09.sec02.exam02;

public class A {
	
	class B{
		
		//인스턴트 필드 : 객체 생성후 사용 가능
		int field1 =1;
		// 정적 필드
		static int field2 =2;
		
		//생성자
		B(){
			System.out.println("B 생성자 실행");
		}
		
		//인스턴트 메서드 : B객체 생성후 B필드1 사용
		void method1() {
			System.out.println("B-method1 실행");
		}
		
		// 인스턴트 정적 메서드 : 자바 17이상, 객체 생성을 하지 않더라도 클래스명,메서드명으로 사용가능
		static void method2() {
			System.out.println("B-method2 실행");
		}
	}

	void useB() {
		B b = new B();
		System.out.println(b.field1);
		b.method1();
		
		System.out.println(B.field2);
	}
}
