package ch12.sec03.exam02;
import java.util.HashSet;
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hashset = new HashSet();	// 데이터 모음에서 객체를 담을때
		
		Student s1 = new Student(1,"홍길동");
		hashset.add(s1);
		System.out.println("저장된 객체 수 : "+hashset.size());
		
		Student s2 = new Student(1,"홍길동");
		hashset.add(s2);
		System.out.println("저장된 객체 수 : "+hashset.size());
		
		Student s3 = new Student(2,"홍길동");
		hashset.add(s3);
		System.out.println("저장된 객체 수 : "+hashset.size());

	}

}
