package data;

public class Player {
	private int speed;
	private int shooting_skills;
	private int exhaust;
	private boolean wounded;
	private boolean substitute;

	public Player(int speed,int shooting_skills,int exhaust
			,boolean wounded,boolean substitute) {
		speed=50;
		shooting_skills=50;
		exhaust=0;
		wounded=false;
		substitute=false;
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
