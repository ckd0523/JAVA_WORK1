package ch14.sec08;

public class DaemonExample {

	public static void main(String[] args) {

		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {Thread.sleep(5500);}catch(InterruptedException e) {}
		
		System.out.println("메인 스레드 종료");
		
	}

}

// main 스레드 종료 되기 전까지 Deamon스레드 작업이 진행 되고 있다가
// main 스레드가 종료될 시점에 인터렙트가 실행