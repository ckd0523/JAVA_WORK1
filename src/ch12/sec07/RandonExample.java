package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandonExample {

	public static void main(String[] args) {

		// 선택 번호
		int[] seclectNumber = new int[6];
		
		Random random = new Random();
		System.out.println("선택 번호 : ");
		
		for(int i=0; i<6; i++) {
			seclectNumber[i] = random.nextInt(45) +1;
			System.out.println(seclectNumber[i]+" ");
		}
		System.out.println();
		
		// 당첨 번호
		int[] winningNumber = new int[6];
		
		random = new Random();
		System.out.println("당첨 번호 : ");
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) +1;
			System.out.println(winningNumber[i]+" ");
		}
		System.out.println();
		
		// 당첨 여부
//		Arrays.sort(seclectNumber);
//		Arrays.sort(winningNumber);
//		boolean result = Arrays.equals(seclectNumber, winningNumber);
//		System.out.println("당첨 여부");
//		if(result) {
//			System.out.println("1등에 당첨 되었습니다.");
//		}
//		else {
//			System.out.println("당첨되지 않았습니다.");
//		}
		int count =0;
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(seclectNumber[i]==winningNumber[j]) {
					count++;
					System.out.print(winningNumber[j]);
				}
			}
			
			
		}
		System.out.println("\n당첨된 번호 갯수 : "+count);
		
	}

}
