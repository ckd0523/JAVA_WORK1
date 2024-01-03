package ch04;
import java.util.Scanner;
public class leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int leapyear;
		Scanner input = new Scanner(System.in);
		System.out.print("확인하고 싶은 년도를 입력하세요. ");
		leapyear=input.nextInt();
		
		if(leapyear%400==0) {
			System.out.printf("%d년은 윤년입니다.",leapyear);
		}
		else if(leapyear%4==0&&leapyear%100!=0) {
			System.out.printf("%d년은 윤년입니다.",leapyear);
		}
		else {
			System.out.printf("%d년은 윤년이 아닙니다.",leapyear);
		}
		
	}

}
