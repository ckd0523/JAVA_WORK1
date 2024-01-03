package ch04;
import java.util.Scanner;
public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int price; // 구매 금액
		double price2; // 청구 금액
		
		Scanner input = new Scanner(System.in);
		System.out.print("구매 금액을 입력하세요. ");
		price=input.nextInt();
		
		if(price>=300000) {
			price2 = price-30000;
			System.out.print("청구 금액은 "+price2+"입니다.");
		}
		else if(300000>price&&price>=100000) {
			price2 = price-5000;
			System.out.print("청구 금액은 "+price2+"입니다.");
		}
		else {
			price2 = price;
			System.out.print("청구 금액은 "+price2+"입니다.");
		}
		
	}

}
