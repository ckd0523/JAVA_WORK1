package ch07.sec07.exam03;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체 생성 부모타입 객체 생성(자동 형변환)
		Parent parent = new Child();
		
		parent.field1="data1";
		parent.method1();
		parent.method2();
		
		System.out.println("parent.field1 : "+parent.field1);
		
//		parent.field2 = "data2";		// 자동 형변환으로 field2가 삭제
//		parent.method3();				// 자동 형변환으로 method3가 삭제
		
		// 강제 형변환 부모를 자식으로
		
		Child child = (Child)parent;
		
		child.field2 ="data2";
		child.method3();
		
	}
		
}
