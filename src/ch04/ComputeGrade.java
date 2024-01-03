package ch04;
import java.util.Scanner;
public class ComputeGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int attendscore, assignmentscore, quizscore;
		int midtermexamscore,finalexamscore;
		double Total;
		
		Scanner input = new Scanner(System.in);
		System.out.print("출석점수를 입력하세요. ");
		attendscore = input.nextInt();
		
		System.out.print("과제점수를 입력하세요. ");
		assignmentscore = input.nextInt();
		
		System.out.print("수시시험 점수를 입력하세요. ");
		quizscore = input.nextInt();
		
		System.out.print("중간고사 점수를 입력하세요. ");
		midtermexamscore = input.nextInt();
		
		System.out.print("기말고사 점수를 입력하세요. ");
		finalexamscore = input.nextInt();
		
		Total = attendscore*0.1 + assignmentscore*0.4 + quizscore*0.1 + midtermexamscore*0.2 + finalexamscore*0.2;
		
		
		if(Total>100) {
			System.out.print("오류 입니다.");
		}
		else if(100>=Total&&Total>=90) {
			System.out.printf("총점은 %.1f입니다.%n",Total);
			System.out.print("학점은 A 입니다.");
		}
		else if(90>Total&&Total>=80) {
			System.out.printf("총점은 %.1f입니다.%n",Total);
			System.out.print("학점은 B 입니다.");
		}
		else if(80>Total&&Total>=70) {
			System.out.printf("총점은 %.1f입니다.%n",Total);
			System.out.print("학점은 C 입니다.");
		}
		else if(70>Total&&Total>=60) {
			System.out.printf("총점은 %.1f입니다.%n",Total);
			System.out.print("학점은 D 입니다.");
		}
		else if(60>Total&&Total>=0){
			System.out.printf("총점은 %.1f입니다.%n",Total);
			System.out.print("학점은 F 입니다.");
		}
		else {
			System.out.print("오류 입니다.");
		}
		
	}
	

}
