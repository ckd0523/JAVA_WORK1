package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample2 {

	public static void main(String[] args) {

		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(1000));
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(500));
		System.out.println("꺼내온 동전 : "+coinBox.pop().getValue()+"원");
		
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(5000));
		
		System.out.println("꺼내온 동전 : "+coinBox.pop().getValue()+"원");
		System.out.println("꺼내온 동전 : "+coinBox.pop().getValue()+"원");
		System.out.println("꺼내온 동전 : "+coinBox.pop().getValue()+"원");
		coinBox.push(new Coin(50000));
		System.out.println("꺼내온 동전 : "+coinBox.pop().getValue()+"원");
		System.out.println("꺼내온 동전 : "+coinBox.pop().getValue()+"원");
		System.out.println("꺼내온 동전 : "+coinBox.pop().getValue()+"원");

		
		
	}

}
