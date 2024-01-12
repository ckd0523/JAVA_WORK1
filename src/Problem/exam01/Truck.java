package Problem.exam01;

public class Truck extends Vehicle {

	int weight;
	
	public Truck(String model, int price, int weight) {
		super(model, price);
		this.weight = weight;
		
	}
	
	public double Tax() {
		if(weight >= 10000) return price*0.04;
		else if(weight >= 5000) return price*0.02;
		else return price*0.01;
	}

	public String toString() {
		return super.toString() + ", 중량 : "  + weight +"kg, 세금 : "+(int)Tax()+ "만원\n";
	}
	
	

}
