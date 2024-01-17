package ch16.sec04;

public class Person {

	
	// 실행문이 두개 이상인 경우
	public void action(Calcuable calcuable) {
		double result = calcuable.calc(10, 4);
		System.out.println("결과 : "+result);
	}
	

	
	
}
