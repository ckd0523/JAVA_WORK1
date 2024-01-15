package ch14.sec05.exam01;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {
		// 일시정지 상태 (Sleep());
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<10; i++) {
			toolkit.beep();
			try {Thread.sleep(3000);} // 3초 일시정지
			catch(InterruptedException e) {}
		}
		
	}

}
