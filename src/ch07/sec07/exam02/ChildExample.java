package ch07.sec07.exam02;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Child child = new Child();
		// child 에서 실행가능한 메서드 : method1(부모), method2(수정), method3(추가)
		
		Parent parent = child;
		// 자식을 부모 객체 타입형으로 자동 변환
		// parent 에서 실행 가능한 메서드 : method1(부모), method2(수정), method3(추가) : 사용 불가
		
		parent.method1();
		parent.method2();
		//parent.method3();			// 부모 객체로 변환이 되면서 method3이 사라짐
		
	}

}
