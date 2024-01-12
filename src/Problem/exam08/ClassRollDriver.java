package Problem.exam08;

import java.util.Scanner;

public class ClassRollDriver {

	public static void main(String[] args) {

		
		 Scanner scan = new Scanner (System.in);
		 int choice;														// 사용자 선택
		 String coursename;											// 교과목명
		 String name;														// 이름
		 int number;														// 학번
		 Student student;												// Student 객체 참조변수

		ClassRoll sbook = new ClassRoll();
		
		System.out.print("교과목명을 입력하세요 : ");
		coursename = scan.next();

		// 출석부의 교과목명을 입력 받은 입교과목명으로 변경한다
    	// 여기에 코드를 입력하세요
		
		do {
			System.out.println("원하는 기능을 선택하세요.");
			System.out.print("(1)추가");
			System.out.print("(2)찾기");
			System.out.println("(3)종료");
			choice =scan.nextInt();
		if(choice==1) {
			 // 추가하는 학생의 학번과 이름을 입력 받은 후 그 학생을 출석부에 추가한다
			System.out.print("추가하는 학생의 학번을 입력하세요 : ");
			number = scan.nextInt();
			System.out.print("추가하는 학생의 이름을 입력하세요 : ");
			name = scan.next();	
			student = new Student();
			student.setNumber(number);
			student.setName(name);
			sbook.add(student);
			
		}
		else if(choice==2) {
			System.out.print("찾는 학번을 입력하세요. ");
			number = scan.nextInt();
			System.out.println(number+"의 이름 : "+sbook.search(number));
		}
		
		}while(choice !=3);
		
		
				
	}

}
