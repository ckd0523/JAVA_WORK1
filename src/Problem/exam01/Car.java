package Problem.exam01;

public class Car extends Vehicle {


	// 승용차의 배기량에 대한 객체 변수를 선언한다
	int gas;

	
	public Car(String model, int price, int gas) {
		super(model,price);
		this.gas=gas;
		
	}
	
			
	public double Tax() {		
			if(gas>=3000) return price*0.05;
			else if(gas>=1500)return price*0.03;
			else return price*0.01;
	}
	
	public String toString() {
		return super.toString() + ", 배기량 : "  + gas +"cc, 세금 : "+(int)Tax()+ "만원\n";
	}

	
}
