package ch17.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapExample {

	public static void main(String[] args) {

		int[] intArray = {1, 2, 3, 4, 5};
		
		IntStream intStream = Arrays.stream(intArray); //배열(intArray)을 스트림형(IntStream)으로 변환
		
		// 정수 -> 실수 InStream형 -> DooubleStream 변환 - 스트림 형변환
		intStream
		.asDoubleStream()		// double 타입 형태로 변환
		.forEach(d->System.out.println(d));
		
		System.out.println();
		
		// 기본타입 -> 참조타입변환
		intStream = Arrays.stream(intArray);
		intStream
		.boxed()		// 기본 -> 참조타입 Wrapper 스트림으로 변환 int -> Integer
		.forEach(obj -> System.out.println(obj.intValue()));
		
	}

}
