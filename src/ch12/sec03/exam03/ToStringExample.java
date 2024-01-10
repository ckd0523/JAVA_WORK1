package ch12.sec03.exam03;

public class ToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SmartPhone myphone = new SmartPhone("삼성전자", "안드로이드");
		
		String strobj = myphone.toString();
		
		System.out.println(strobj);
		
		System.out.println(myphone);
		
		
		
	}

}
