package ch04;
import java.util.Scanner;
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double Score;
		int toeicScore;
		
		Scanner input = new Scanner(System.in);
		System.out.print("토익 점수를 입력하세요 ");
		toeicScore =input.nextInt();
		
		System.out.print("평점을 입력하세요 ");
		Score =input.nextDouble();
		
		if(toeicScore>=700) {
			if(Score>=4.0) {
				System.out.print("면접 대상자 입니다.");
			}
			else if(Score>=3.5) {
				System.out.print("서류 전형 대상자입니다.");
			}
			else if(Score>=3.0) {
				System.out.print("필기 시험 대상자 입니다.");
			}
			else {
				System.out.print("지원 할수 없습니다.");
			}
		}
		else {
			System.out.print("지원 할수 없습니다.");
		}
		
		
	}

}
