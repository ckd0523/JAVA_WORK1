package Problem.exam04;

import java.util.*;

public class Driver {
	public static void main(String[] args) {
		
		String flag = "예";
		PairOfDice dice = new PairOfDice();
		Player player1, player2 ;
		
		player1 = new Player("홍길동");
		player2 = new Player("이순신");
		
		Scanner input = new Scanner(System.in);
		
		do{
		System.out.println(player1.getName());
		player1.roll(dice);
		
		System.out.println(player2.getName());
		player2.roll(dice);
		
		if(player1.getTotal()>player2.getTotal()) {System.out.println("플레이어 "+player1.getName()+" (이)가 이겼다.");}
		else if((player1.getTotal()<player2.getTotal())){System.out.println("플레이어 "+player2.getName()+" (이)가 이겼다.");}
		else {System.out.println("비겼다.");}
		
		System.out.println("게임을 계속 하시겠습니까?");
		flag = input.next();
	}while(flag.equals("예"));
		
	}

}
