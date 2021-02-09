package data;

import java.util.ArrayList;

public class WorldCup {
	private String date;
	private String country;
	private Team winner;
	
	public Team getWinner() {
		return winner;
	}
	public void setWinner(Team winner) {
		this.winner = winner;
	}

	private ArrayList<Team> teamInit=new ArrayList<Team> ();
	
	
	public WorldCup(String date, String country,ArrayList<Team> teamInit) {
		super();
		this.date = date;
		this.country = country;
		this.teamInit=teamInit;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public Team getTeamInit(int i) {
		return teamInit.get(i);
	}
	
	public ArrayList<Team> getTeamInit() {
		return teamInit;
	}
	public void setTeamInit(ArrayList<Team> teamInit) {
		this.teamInit = teamInit;
	}
	
	@Override
	public String toString() {
		return "WorldCup [date=" + date + ", country=" + country + "]";
	}
}