package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {

		try {
			OutputStream os = new FileOutputStream("c:/temp/test1.db"); 		// 파일 열기
			
			byte a = 10;		// 값 범위 : -128 ~ 127
			byte b = 20;
			byte c = 30;
			
			os.write(a);		// 파일에 데이터 쓰기
			os.write(b);
			os.write(c);
			
			os.flush(); 		// 메모리 내에 잔류 데이터 버리기
			os.close();			// 파일 닫기 : 출력 스트림 닫기 : 메모리 객체
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
