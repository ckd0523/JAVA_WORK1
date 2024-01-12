package Problem.exam04;

public class Player {
	
	//필드
	private String name;
	private int total;
	
	//생성자
	public Player(String name) {
		setName(name);
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getTotal() {return total;}
	
	public void roll(PairOfDice dice) {
		int value1,value2;
		
		dice.roll();
		value1 = dice.getFacevalue1();
		value2 = dice.getFacevalue2();
		
		total = value1+value2;
		
		System.out.println("\t 주사위 1 : "+value1+", 주사위 2 : "+value2+", 총합 :"+total);
		
	}
	
	//메서드

	
	
}
