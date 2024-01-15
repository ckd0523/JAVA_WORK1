package ch14.sec09.exam01;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ExcutoerServiceExample {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		executorService.shutdownNow();
		
	}

}
