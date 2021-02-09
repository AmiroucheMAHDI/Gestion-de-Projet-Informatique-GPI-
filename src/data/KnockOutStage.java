package data;

public class KnockOutStage {
	private Team team1;
	private Team team2;
	private Team winnerTeam;
	
	public KnockOutStage(Team team1, Team team2, int type) {
		super();
		this.team1 = team1;
		this.team2 = team2;
		winnerTeam = null;
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
	public Team getWinnerTeam() {
		return winnerTeam;
	}
	public void setWinnerTeam(Team winnerTeam) {
		this.winnerTeam = winnerTeam;
	}
	@Override
	public String toString() {
		return "KnockOutStage [team1=" + team1.getName() + ", team2=" + team2.getName() + "]";
	}
}
