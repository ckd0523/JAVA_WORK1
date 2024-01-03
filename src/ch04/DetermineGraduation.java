package ch04;
import java.util.Scanner;
public class DetermineGraduation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int totalcreditearned,ToeicScore; //총 이수 학점
		
		Scanner input = new Scanner(System.in);
		System.out.print("총 이수 학점을 입력하세요. ");
		totalcreditearned=input.nextInt();
		
		System.out.print("TOEIC점수를 입력하세요. ");
		ToeicScore=input.nextInt();
		
		if(totalcreditearned>=140) {
			if(ToeicScore>=700) {
				System.out.print("졸업을 축하합니다.");
			}
			else {
				System.out.print("아쉽지만 수료하셨습니다.");
			}
		}
		else {
			System.out.print("졸업이 불가합니다.");
		}
	}

}
