package ch06.sec10;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator myCalc = new Calculator();
		
		double result1 =10*10*myCalc.pi;
		int result2=myCalc.plus(10, 5);
		int result3=myCalc.minus(10, 5);
		
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
	}

}
