package ch06exam01.package1;

public class B {

	A a1 = new A(true); //boolean 타입 : public이라서 접근 가능
	A a2 = new A(1); //int 타입 : default : 같은 패키지라 접근 가능
	// A a3 = new A("문자열"); //private 같은 파일 내가 아니라서 접근 불가능
}
