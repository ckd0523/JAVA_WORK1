package ch14.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {
			// Runnable() 객체 통해 스레드 작업 생성
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
				}
			}
		});

		thread.start(); // 스레드 동작

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");

			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}

	}

}
