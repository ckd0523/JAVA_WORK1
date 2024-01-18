package ch17.sec11;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {

	public static void main(String[] args) {

		
		List<Integer> list = new ArrayList<>();
		
		// 방법 1 : 계산을 먼저하고 계산된 값이 있는가? -> 참 : 거짓 처리
		OptionalDouble optional = list.stream()
				.mapToInt(Integer :: intValue)
				.average();
		if(optional.isPresent()) {
			System.out.println("방법1_평균"+optional.getAsDouble());
		} else {
			System.out.println("방법1_평균 : 0.0");
		}
		
		// 방법 2 : 값이 없는 것을 orElse()로 처리
		double avg = list.stream()
				.mapToInt(Integer :: intValue)
				.average()
				.orElse(0.0);
		System.out.println("방법2_평균 : "+avg);
		
		// 방법 3 : 람다식
		list.stream()
			.mapToInt(Integer :: intValue)
			.average()
			.ifPresent(a->System.out.println("방법3_평균 : "+a));
		
		
		
	}

}
