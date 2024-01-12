package Problem.exam01;

public class VehicleDriver {

	public static void main(String[] args) {

		Car car1 = new Car("제네시스", 5000, 3500);
		System.out.println(car1);

		
		Truck truck = new Truck("봉고", 2000, 2500);
		System.out.println(truck);
		
		Car car2 = new Car("쏘울", 1500, 1000);
		System.out.println(car2);
		
	}

}
