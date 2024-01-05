package ch07.sec07.exam02;

public class Child extends Parent {

	@Override
	public void method2() {			// 부모 메서드 2를 오버라이딩하여 내용을 수정	// 수정된 메서드
		System.out.println("Chlid-method2()");
		
	}
	
	public void method3() {			// 자식 객체에 새로운 메서드를 추가했다		// 추가된 메서드
		System.out.println("Chlid-method3()");
		
	}

	
	
	
}
