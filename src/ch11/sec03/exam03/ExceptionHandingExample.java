package ch11.sec03.exam03;

public class ExceptionHandingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			String[] array = {"100","1oo",null,"200"};
			
			for(int i = 0; i<=array.length; i++) {
				try {
					int value = Integer.parseInt(array[i]);
					System.out.println("array["+i+"] : "+value);
					
				}
				catch(ArrayIndexOutOfBoundsException e){
					System.out.println("배열 인덱스가 초과됨 :"+e.getMessage());
				}
				// |연결자 기호를 이용해서 2가지 이상의 예외를 동일하게 처리
				catch(NullPointerException |NumberFormatException e) {//상위 예외 클래스는 아래쪽에 작성해야 에러가 나지 않는다.
					System.out.println("데이터에 문제가 있음 : "+e.getMessage());
				}
			}
		
		
	}

}
