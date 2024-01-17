package ch17.sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {

		// 배열 생성 String -> Stream<String> String 객체 : 객체 처리
		String[] strArray = {"홍길동", "신용권", "김미나"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(item -> System.out.print(item + ", "));
		System.out.println();
		
		
		// int -> IntStream : int는 타입이다. -> 타입에 맞는 스트림으로 담아 준다 IntStream
		int[] intArray = {1, 2, 3, 4, 5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(item -> System.out.print(item + ", "));
		System.out.println();
		
	}

}
