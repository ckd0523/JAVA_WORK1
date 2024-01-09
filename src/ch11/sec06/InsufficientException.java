package ch11.sec06;

public class InsufficientException extends Exception {// Exception 상속받기 (일반예외)
	
	
	public InsufficientException() {// 일반 생성자 : 에러에 대한 간략한
		
	}
	public InsufficientException(String message) {
		super(message);
	}
	

}
