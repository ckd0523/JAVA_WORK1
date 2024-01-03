package ch04;

public class countdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		for(int i=10; i > 0; i--) {
			System.out.println(i);
			Thread.sleep(1000);
			
			
		}
		System.out.println("발사");
	}

}