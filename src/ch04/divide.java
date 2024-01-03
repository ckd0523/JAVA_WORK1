package ch04;
import java.util.Scanner;
public class divide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean multple=false;
		int num;
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요. ");
		num=input.nextInt();
		
		if(multple==false) {
			
			if(num%3==0) {
				System.out.println("3의 배수입니다.");
				multple=true;
			}
			
			if(num%5==0) {
				System.out.println("5의 배수입니다.");
				multple=true;
			}
			
			if(num%8==0) {
				System.out.println("8의 배수입니다.");
				multple=true;
			}
		
		}
		
		if(multple == false) {
			System.out.println("어느 배수도 아니다.");
		}
		
	}

}
