package ch07.sec06.package2;
import ch07.sec06.package1.A;
public class D extends A { // 다른 패키지내에 상속을 받기 위해서는 먼저 import로 가져와야한다.

	public D() {
		super();
	}
	
	public void method1() {
		this.field="value";
		this.method();
	}
	
	public void method2() {
		
//		A a = new A();					// 객체 생성
//		
//		a.field = "value";				// 생성된 객체 필드 X
//		a.method();						// 생성된 객체 메서드 X
		
	}
	
	// protected 로 설정된 다른 패키지의 클래스의 상속을 받더라도 직접적인 객체 생성은 되지 않는다.
	// protected 상속 : 간접적으로 필드나 메서드를 받을수 있다.
	
}
