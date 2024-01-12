package Problem.exam05;

public class Team {
	
	public String	teamName;
	private int Score;
	
	public Team() {}
	
	public Team(String newTeamName, int newScore) {
		teamName=newTeamName;
		Score=newScore;
	}

	public String getTeamName() {return teamName;}
	public void setTeamName(String teamName) {this.teamName = teamName;}
	public int getScore() {return Score;}
	public void setScore(int score) {Score = score;}
	
	public String toString() {
		String strToReturn = new String();
		strToReturn += "팀명 : "+teamName+"\n";
		strToReturn += "점수 : "+Score;
		return(strToReturn);
	}
	
	

}
