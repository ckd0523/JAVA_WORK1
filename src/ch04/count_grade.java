package ch04;
import java.util.Scanner;
public class count_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score=0;
		int totalCount=0;
		int Acount=0;
		int Bcount=0;
		int Ccount=0;
		int Dcount=0;
		int Fcount=0;
		
		
		Scanner input = new Scanner(System.in);
		
		
		while(score!=-1) {
			
			System.out.print("점수를 입력하세요.(종료하려면 -1를 입력하세요.) ");
			score=input.nextInt();
			
			if(score!=-1) {
					if(100>=score&&score>=90) {
						Acount++;
					}
					else if(90>score&&score>=80){
						Bcount++;
					}
					else if(80>score&&score>=70){
						Ccount++;
					}
					else if(70>score&&score>=60){
						Dcount++;
					}
					else if(0<=score&&score<60){
						Fcount++;
					}
					else if(score>100 || score<0) {
						System.out.println("잘못 입력하셨습니다. 다시 확인해주세요.");
						break;
					}
			
				totalCount++;
			}
		}
		System.out.println("A학점수: "+Acount);
		System.out.println("B학점수: "+Bcount);
		System.out.println("C학점수: "+Ccount);
		System.out.println("D학점수: "+Dcount);
		System.out.println("F학점수: "+Fcount);
		System.out.println("점수들의 총수: "+totalCount);
		
	}

}
