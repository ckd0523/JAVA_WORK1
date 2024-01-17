package ch17.sec08;

import java.util.Arrays;

public class LoopingExample {

	public static void main(String[] args) {

		int[] intArr= {1, 2, 3, 4, 5};
		
		
		// 잘못 작성된 경우
		//Arrays.stream(intArr)	// intArr 배열을 스트림 배열 형태로 변
		//.filter(a->a%2==0)		// 필터 : 2의 배수만 필터
		//.peek(n->System.out.println(n));	// peek : 중간처리이기 때문에 뒤에 최종처리문이 있어야 처리
		
		int total = Arrays.stream(intArr)	// intArr 배열을 스트림 배열 형태로 변
		.filter(a->a%2==0)		// 필터 : 2의 배수만 필터
		.peek(n->System.out.println(n))	// peek : 중간처리이기 때문에 뒤에 최종처리문이 있어야 처리
		.sum();	// sum() 집계 : 최종 처리문
		
		System.out.println("총합 : "+total);
		
		Arrays.stream(intArr)
		.filter(a->a%2==0)	
		.forEach(n->System.out.println(n));
		
	}

}
