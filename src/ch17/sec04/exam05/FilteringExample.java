package ch17.sec04.exam05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {

		
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("신용권");
		list.add("신민철");
		
		// 중복 제거 - 중복 요소 제거 : 파이프 라인을 이용하여 중간 처리
		list.stream()
		.distinct()
		.forEach(n->System.out.println(n));
		System.out.println();
		
		// 필터링 : 신으로 시작하는 요소만 true 출력
		list.stream() 
		.filter(n->n.startsWith("신"))
		.forEach(n->System.out.println(n));
		System.out.println();
		
		// 중복 제거하고 신으로 시작하는 요소만 출력
		list.stream()
		.distinct()
		.filter(n->n.startsWith("신"))
		.forEach(n->System.out.println(n));
		System.out.println();
		
	}

}
