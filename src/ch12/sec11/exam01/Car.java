package ch12.sec11.exam01;

public class Car {

	public static void main(String[] args) {
		
		// 방법1
//		Class claszz=Car.class;
	
		// 방법2
//		Class clazz = Class.forName("ch12.sec11.exam01.Car");
		
		// 방법3
		Car car = new Car();
		Class claszz = car.getClass();
		
		System.out.println("패키지 : "+claszz.getPackage().getName());
		System.out.println("클래스 간단 이름 : "+claszz.getSimpleName());
		System.out.println("클래스 전체 이름 : "+claszz.getName());

	}

}
