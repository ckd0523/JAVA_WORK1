package ch12.sec10;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {

		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "01-123-4567";
		
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("전화번호 형태 입니다.");
		}
		else {
			System.out.println("전화번호 형태가 아닙니다.");
		}
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@mycompany.com";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("이메일 형태 입니다.");
		}
		else {
			System.out.println("이메일 형태가 아닙니다.");
		}
		
	}

}
