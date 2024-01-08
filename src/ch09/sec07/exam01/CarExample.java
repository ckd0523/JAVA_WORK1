package ch09.sec07.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car mycar = new Car();
		
		mycar.run1();
		
		mycar.run2();
		
		//Tire tire = new Tire();
		
		
		mycar.run3(new Tire(){
			@Override
			public void roll() {
				System.out.println("익명 자식 객체 3이 굴러갑니다.");
			}
		});
		

	}

}
