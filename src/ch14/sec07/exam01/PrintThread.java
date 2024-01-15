package ch14.sec07.exam01;

public class PrintThread extends Thread {

	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop=stop;
	}
	
	@Override
	public void run() {
		while(!stop) {	//stop이 true -> false 중지 stop이 false -> true 실행
			System.out.println("실행중");	// 스탑 명령이 들어오기 전까지 계속 실행
		}
		System.out.println("리소스 종료");//리소스 종료를 하고
		System.out.println("실행 종료");//실행 종료를 해야 (안전 종료)
	}
	
}
