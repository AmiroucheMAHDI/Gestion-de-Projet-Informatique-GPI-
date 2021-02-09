package data;

import java.util.ArrayList;

public class Player {
	private int speed;
	private int shooting_skills;
	private int exhaust;
	private boolean wounded;
	private boolean substitute;
	private String name;
	
	public Player(String name,int speed,int shooting_skills,int exhaust
			,boolean wounded,boolean substitute) {
		
		this.name=name;
		this.speed=speed;
		this.shooting_skills=shooting_skills;
		this.exhaust=0;
		this.wounded=wounded;
		this.substitute=substitute;
	}
	
	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getShooting_skills() {
		return shooting_skills;
	}

	public void setShooting_skills(int shooting_skills) {
		this.shooting_skills = shooting_skills;
	}

	public int getExhaust() {
		return exhaust;
	}

	public void setExhaust(int exhaust) {
		this.exhaust = exhaust;
	}

	public boolean isWounded() {
		return wounded;
	}

	public void setWounded(boolean wounded) {
		this.wounded = wounded;
	}

	public boolean isSubstitute() {
		return substitute;
	}

	public void setSubstitute(boolean substitute) {
		this.substitute = substitute;
	}
	
}
