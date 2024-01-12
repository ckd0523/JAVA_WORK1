package Problem.exam04;

public class PairOfDice {
	
	//필드
	private int facevalue1,facevalue2;
	
	
	//생성자
	public PairOfDice() {
		facevalue1=1;
		facevalue2=1;
	}

	//메서드
	public int getFacevalue1() {return facevalue1;}
	public int getFacevalue2() {return facevalue2;}
	
	public void roll() {
		facevalue1=(int)(Math.random()*6)+1;
		facevalue2=(int)(Math.random()*6)+1;
	}
	
	
	
}
