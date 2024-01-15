package ch15.sec01.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import ch15.sec01.exam01.*;

import ch15.sec01.exam01.Board;


public class VectorExample {
	public static void main(String[] args) {
	
	List<Board> list = new Vector<>();	
	// ArrayList 로 멀티 스레드 작업을 할때에는 경합이 발생하여 어떤 스레드 에서 저장이 되지 않는 문제가 발생이 되어 Loss가 생길수 있다.
		

	//List<Board> list = new ArrayList<>();
	
	Thread threadA = new Thread() {
		@Override
		public void run() {
			for(int i= 1; i<=1000; i++) {
				list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
				
			}
		}
	};
	
	Thread threadB = new Thread() {
		@Override
		public void run() {
			for(int i= 1001; i<=2000; i++) {
				list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
				
			}
		}
	};
	
	threadA.start();
	threadB.start();
	
	try {
		threadA.join();
		threadB.join();
	} catch(Exception e) {}
	
	int size = list.size();
	System.out.println("총 객체 수 : "+size);
	System.out.println();
	}	
}
