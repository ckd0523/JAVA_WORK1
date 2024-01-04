package ch06.sec06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// main 에서 car 클래스 사용
		
//		Car mycar = new Car();
//		System.out.println("모델명 : " +mycar.model);
//		System.out.println("시동 여부"+mycar.start);
//		System.out.println("시동 여부"+mycar.speed);
//		
		
		Car mycar = new Car();
		System.out.println("제조회사 : " +mycar.company);
		System.out.println("모델명 : " +mycar.model);
		System.out.println("색깔 : " +mycar.color);
		System.out.println("최대 속도 : " +mycar.maxSpeed);
		System.out.println("현재 속도 : " +mycar.speed);		//초기값 설정이 안되어 있어 기본값 0으로 출력
		
		//car 객체에 필드값 변경
		
		mycar.speed = 60;
		System.out.println("수정된 속도 : " +mycar.speed);
		
		mycar.color="빨강";
		System.out.println("수정된 색깔 : " +mycar.color);
				
		
	}

}
