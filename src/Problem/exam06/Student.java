package Problem.exam06;

import java.util.*;

public class Student {
	
	String name;				// 이름
	int quizsocre;			// 퀴즈
	int midtermscore;		// 중간
	int finalscore;			//기말
	
	
	public Student() {}
	
	public Student(String studentName) {name=studentName;}

	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getQuizsocre() {return quizsocre;}
	public void setQuizsocre(int quizsocre) {this.quizsocre = quizsocre;}
	public int getMidtermscore() {return midtermscore;}
	public void setMidtermscore(int midtermscore) {this.midtermscore = midtermscore;}
	public int getFinalscore() {return finalscore;}
	public void setFinalscore(int finalscore) {this.finalscore = finalscore;}
	
	public String toString() {
		String str ="";
		str += "이름 : "+name+"\n";
		str += "퀴즈 점수 : "+quizsocre+"\n";
		str += "중간 점수 : "+midtermscore+"\n";
		str += "기말 점수 : "+finalscore;
		return (str);
	}
	
	public void inputGrades() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(name+"의 퀴즈 점수를 입력하세요. ");
		quizsocre=scan.nextInt();
		
		while(quizsocre<0||quizsocre>100){
			System.out.print("다시 0부터 100까지의 퀴즈시험 점수를 입력하세요!! ");
			quizsocre=scan.nextInt();
		}
		
		System.out.print(name+"의 중간시험 점수를 입력하세요. ");
		midtermscore=scan.nextInt();
		
		while(midtermscore<0||midtermscore>100){
			System.out.print("다시 0부터 100까지의 중간시험 점수를 입력하세요!! ");
			midtermscore=scan.nextInt();
		}
		
		System.out.print(name+"의 기말시험 점수를 입력하세요. ");
		finalscore=scan.nextInt();
		
		while(finalscore<0||finalscore>100){
			System.out.print("다시 0부터 100까지의 기말시험 점수를 입력하세요!! ");
			finalscore=scan.nextInt();
		}
		
	}
	 public double getTotal() {
		 return (double)(midtermscore*0.3)+(finalscore*0.5)+(quizsocre*0.2);
	 }
	 
	 public String Grade() {
		 if(getTotal()>=90) return "A";
		 else if(getTotal()>=80) return "B";
		 else if(getTotal()>=80) return "C";
		 else if(getTotal()>=80) return "D";
		 else return "F";
	 }
	 
	
	
	
}
