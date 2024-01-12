package ch12.sec11.exam03;

import java.util.*;
import java.text.*;

public class DateExample {

	public static void main(String[] args) {

		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strNow =sdf.format(now);
		System.out.println(strNow);
		
	}

}
