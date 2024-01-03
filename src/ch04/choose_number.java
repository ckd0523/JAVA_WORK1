package ch04;
import java.util.*;
public class choose_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int targetNumber;
//		int count=0;
//		int guessNumber=0;
//		String again;
//		final int sentinel;
//		
//		Random random = new Random();
//		targetNumber = random.nextInt(100);
//		
//		Scanner input = new Scanner(System.in);
//		
//		
//		
//		while(guessNumber != -99) {
//			System.out.print("추측할 숫자를 입력하세요. ");
//			guessNumber=input.nextInt();
//			
//			if(guessNumber!=targetNumber) {
//				if(guessNumber>targetNumber) {
//					System.out.println("추측한 숫자가 더 큽니다.");
//				}
//				else{
//					System.out.println("추측한 숫자가 더 작습니다.");
//				}
//				
//			count++;
//			}
//			else {
//					count++;
//					System.out.println("추측한 숫자가 맞습니다.");
//					System.out.println("추측 시도 횟수는 "+count+"회 입니다.");
//				}
//			}
//		
//		
//		System.out.println("게임을 종료 합니다.");
		
		int targetNumber;
		int count=0;
		int guessNumber=0;
		String again="예";
		final int sentinel=-99;
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		while(again.equals("예")) {
		
		targetNumber = random.nextInt(100);
		
				while(guessNumber !=sentinel) {
					count++;
					System.out.print("추측할 숫자를 입력하세요.(나가고 싶으면 -99를 입력하시오.) ");
					guessNumber=input.nextInt();
					
					if(guessNumber>targetNumber) {
						System.out.println("추측한 숫자가 더 큽니다. ");				
						}
					else if(guessNumber<targetNumber) {
						System.out.println("추측한 숫자가 더 작습니다. ");	
					}
					else {
						System.out.println("추측한 숫자가 맞습니다. ");	
						break;
					}
				}
	
		System.out.println("계속하기를 원하는가 (예 혹은 아니요)");
		again = input.next();
		
			}
		System.out.println("게임을 종료 합니다.");
		
	}

}
