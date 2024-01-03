package ch04;
import java.util.Scanner;
public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score=0;	//점수
		int count = 0; // 점수들의 수
		int max=-1; //최고 점수
		int min=101;	//최저 점수
		int sum=0; // 합계
		double aver;	//평균점수
		
		Scanner input = new Scanner(System.in);
		
		while(score!=-99) {
			System.out.print("점수를 입력하세요. (점수가 없다면 -99를 입력하세요.) ");
			score=input.nextInt();
			
				if(score!=-99) {
						
						sum+=score;
			
						if (max<score) {
							max=score;
						}
						
						if(min>score) {
							min=score;
						}
			
						count++;
				}
		}
		aver=(double) sum/count;
		System.out.println("최고 점수는 "+max);
		System.out.println("최저 점수는 "+min);
		System.out.println("평균 점수는 "+aver);
		
	}

}
