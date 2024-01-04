package ch06.exam03.package1;

// 클래스 A와 같은 패키지 내에 있다.
public class B {

	public void method() {
		
		// A클래스에 접근하여 a 객체 생성
		A a = new A();
		
		// a 객체의 필드 값 변경
		a.field1 = 1;		// field1 : public		모든 곳에서 사용가능
		a.field2 = 1;		// field2 : default	같은 패키지안에 있어서 실행가능
		//a.field3 = 1;		// field3 : private	같은 파일 내가 아니라 접근 불가
		
		// a 객체에 매서드 실행
		a.method1();		// method1 : public	모든 곳에서 사용가능
		a.method2();		// method2 : default	같은 패키지안에 있어서 실행가능
		//a.method3();		// method3 : private 	같은 파일 내가 아니라 접근 불가
		
	}
	
	
	
}
