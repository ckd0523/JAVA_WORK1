package Problem.exam05;

public class Game {

	public static void main(String[] args) {

		
		Team home = new Team();
		Team vistor = new Team();
		
		home.setTeamName("엘지");
		vistor.setTeamName("삼성");
		
		home.setScore(5);
		vistor.setScore(7);
		
		System.out.println(home);
		
		
		if(home.getScore()>vistor.getScore()) {
			System.out.println(home.getTeamName()+"팀이 이긴다");}
		else if(home.getScore()<vistor.getScore()) {
			System.out.println(vistor.getTeamName()+"팀이 이긴다");}
		else {System.out.println(vistor.getTeamName()+"비긴다.");}
		
		home.setScore(9);
		vistor.setScore(3);
		
		if(home.getScore()>vistor.getScore()) {
			System.out.println(home.getTeamName()+"팀이 이긴다");}
		else if(home.getScore()<vistor.getScore()) {
			System.out.println(vistor.getTeamName()+"팀이 이긴다");}
		else {System.out.println(vistor.getTeamName()+"비긴다.");}
		
		
	}

}
