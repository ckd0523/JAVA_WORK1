package ch06.exam03.package2;

import ch06.exam03.package1.A;

public class C {

	
public void method() {
		
		// A클래스에 접근하여 a 객체 생성
		A a = new A();
		
		// a 객체의 필드 값 변경
		a.field1 = 1;		// field1 : public		모든 곳에서 사용가능
		//a.field2 = 1;		// field2 : default	같은 패키지안이 아니라 실행불가능
		//a.field3 = 1;		// field3 : private	같은 파일 내가 아니라 접근 불가
		
		// a 객체에 매서드 실행
		a.method1();		// method1 : public	모든 곳에서 사용가능
		//a.method2();		// method2 : default	같은 패키지안이 아니라 실행불가능
		//a.method3();		// method3 : private 	같은 파일 내가 아니라 접근 불가
		
	}
	
}
