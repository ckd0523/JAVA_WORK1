package ch06.sec08;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calculator myCalc =new Calculator();
		
		double result1=myCalc.areaRectangle(10);
		
		double result2=myCalc.areaRectangle(10,5);
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
	}

}
