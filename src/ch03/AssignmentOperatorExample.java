package ch03;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		result += 10;		// result = 0+10 = 10
		System.out.println("result = "+result);
		
		result -= 5;	// result = 10-5 = 5
		System.out.println("result = "+result);
		
		result *= 3;	// result = 5*3 = 15
		System.out.println("result = "+result);
		
		result /= 5;	// result = 15/5 = 3
		System.out.println("result = "+result);
		
		result %= 3;	// result = 3%3 = 0
		System.out.println("result = "+result);
	}

}
