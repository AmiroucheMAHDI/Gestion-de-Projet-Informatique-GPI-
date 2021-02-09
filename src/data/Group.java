package data;

import java.util.ArrayList;

public class Group {
	private int point1;
	private int point2;
	private int point3;
	private int point4;
	
	private Team team1;
	private Team team2;
	private Team team3;
	private Team team4;
	
	private int nbmatchDone;
	
	
	private String commentary="";
	
	public String getCommentary() {
		return commentary;
	}

	public void setCommentary(String commentaryNext) {
		commentary = commentary+"\n"+commentaryNext;
	}
	
	private ArrayList<Team> Winner;
	
	public Group(Team team1,Team team2,Team team3,Team team4){
		this.team1=team1;
		this.team2=team2;
		this.team3=team3;
		this.team4=team4;
		
		point1=0;
		point2=0;
		point3=0;
		point4=0;
		
		nbmatchDone=0;
		
		Winner=new ArrayList<Team>();
		commentary="";
	}
	
	public void getPoint(Team a,int winner) { //winner=1 if the team had win or winner=0 if the team had lose
		int score=3;
		
		if(winner==0) {
			score=0;
		}
		
		if(winner==2) {
			score=1;
		}
		
		if(a==team1) {
			point1=point1+score;
		}
		if(a==team2) {
			point2=point2+score;
		}
		if(a==team3) {
			point3=point3+score;
		}
		if(a==team4) {
			point4=point4+score;
		}
	}

	public int getPoint(int i) {
		if(i==0) {
			return getPoint1();
		}else if(i==1) {
			return getPoint2();
		}else if(i==2) {
			return getPoint3();
		}else{
			return getPoint4();
		}
	}
	public int getPoint1() {
		return point1;
	}

	public void setPoint1(int point1) {
		this.point1 = point1;
	}

	public int getPoint2() {
		return point2;
	}

	public void setPoint2(int point2) {
		this.point2 = point2;
	}

	public int getPoint3() {
		return point3;
	}

	public void setPoint3(int point3) {
		this.point3 = point3;
	}

	public int getPoint4() {
		return point4;
	}

	public void setPoint4(int point4) {
		this.point4 = point4;
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

	public Team getTeam3() {
		return team3;
	}

	public void setTeam3(Team team3) {
		this.team3 = team3;
	}

	public Team getTeam4() {
		return team4;
	}

	public void setTeam4(Team team4) {
		this.team4 = team4;
	}

	public int getNbmatchDone() {
		return nbmatchDone;
	}

	public void setNbmatchDone(int nbmatchDone) {
		this.nbmatchDone = nbmatchDone;
	}

	
	
	public Team getWinnerId(int i) {
		return Winner.get(i);
	}
	public ArrayList<Team> getWinner() {
		return Winner;
	}

	public void setWinner(ArrayList<Team> winner) {
		Winner = winner;
	}
	
	
}