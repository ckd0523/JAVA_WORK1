package ch09.sec06.exam03;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//OK버튼 객체 생성
		Button btnOk = new Button();
		
		//OK버튼 클릭 이벤트를 처리할 ClickListener 구현
		class OkListener implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("OK 버튼을 클릭했습니다.");
				
			}
			
		}
		
		// Cancle 버튼 객체에 ClickListener 구현 객체 주입
		btnOk.setClickListener(new OkListener());
		// Cancle 버튼 클릭 실행
		btnOk.click();

		//-----------------------------------------
		
		Button btcencle = new Button();
		
		//Cancle 버튼 클릭 이벤트를 처리할 ClickListener 구현
		class BtcencleListener implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("Cencle 버튼을 클릭했습니다.");
				
			}
			
		}
		
		// Cancle 버튼 객체에 ClickListener 구현 객체 주입
		btcencle.setClickListener(new BtcencleListener());
		// Cancle 버튼 클릭 실행
		btcencle.click();
		
		
	}

}
