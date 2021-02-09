package data;

public class Match {

	private Team team1;
	private Team team2;
	private String result;
	private String stadium;
	private int goal1;
	private int goal2;
	private String date;
	private String time;
	private Team Winner;
	private String commentary;
	
	public  String GetLastCommentary() {
		return commentary;
	}
	public  void SetCommentary(String a) {
		commentary=a;
	}
	
	public String NameWinner() {
		if(Winner==null) {
			return "Draw";
		}else {
			return Winner.getName();
		}
	}
	public Team getWinner() {
		return Winner;
	}
	public void setWinner(Team winner) {
		Winner = winner;
	}
	
	public Match(Team t1,Team t2,String result,String stadium,int goal1,int goal2,String date,String time) {
		result = null;
		goal1 = 0;
		goal2 = 0;
		this.stadium =stadium;
		this.date = stadium;
		this.time = time;
		team1 = t1;
		team2 = t2;
		Winner=null;
		commentary="";
		
	}
	public Team getTeam1() {
		return team1;
	}
	public void setTeam1(Team team1) {
		this.team1 = team1;
	}
	public Team getTeam2() {
		return team2;
	}
	public void setTeam2(Team team2) {
		this.team2 = team2;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getStadium() {
		return stadium;
	}
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	public int getGoal1() {
		return goal1;
	}
	public void setGoal1(int goal1) {
		this.goal1 = goal1;
	}
	public int getGoal2() {
		return goal2;
	}
	public void setGoal2(int goal2) {
		this.goal2 = goal2;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Match [team1=" + team1.getName() + ", team2=" + team2.getName() 
				+ ", result=" + result + ", stadium=" + stadium + ", goal1="
				+ goal1 + ", goal2=" + goal2 + ", date=" + date + ", time=" + time 
				+ ", coach1 = " + team1.getC().getSkill() + ", coach2 = " + team2.getC().getSkill() + "]";
	}
	
}