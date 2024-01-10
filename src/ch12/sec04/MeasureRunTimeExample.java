package ch12.sec04;

public class MeasureRunTimeExample {

	public static void main(String[] args) {
		
		
		// 밀리 타임 : 1/1000 초 단위
		// 나노 타임 : 1/10^9 초 단위
		
		long time1 = System.nanoTime();
		
			int sum = 0;
			for(int i = 1; i<=1000000; i++) {
				sum+=i;
			}
			
		long time2 = System.nanoTime();
		
		System.out.println("1~1000000까지의 합 : "+sum);
		System.out.println("계산에 "+(time2-time1)+"나노초가 소요 되었습니다.");
		

	}

}
