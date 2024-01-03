package ch05;
import java.util.*;
public class grade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean run = true;
		
		int studentNum=0;
		int[] scores = null;
		int sum = 0;
		double avg = 0;
		int max = -1;
		
		Scanner input = new Scanner(System.in);
		
		while(run) {
			
			System.out.println("--------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수 입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택 : ");
			
			int selectNo = Integer.parseInt(input.nextLine());
			
			if(selectNo == 1) {
				System.out.print("학생수 : ");
				studentNum = Integer.parseInt(input.nextLine());
				scores = new int[studentNum];
			}
			else if(selectNo==2) {
				int i=0;
				while(i<scores.length) {
					
					System.out.print("점수를 입력하세요 : ");
					scores[i] = Integer.parseInt(input.nextLine());
					sum += scores[i];
					avg=(double)sum/studentNum;
					 
					if(max<scores[i]) {
						max=scores[i];
					}
					i++;		
				}
			
			}
			else if(selectNo==3) {
				for(int k=0; k<scores.length; k++) {
					System.out.println("scores["+k+"] : "+scores[k]);
				}
			}
			else if(selectNo==4) {
				System.out.println("최고 점수는 : "+max);
				System.out.println("평균 점수는 : "+avg);
			}
			else if(selectNo==5) {
				run=false;
			}
			
		}
		System.out.println("종료 되었습니다.");
		
	}

}
