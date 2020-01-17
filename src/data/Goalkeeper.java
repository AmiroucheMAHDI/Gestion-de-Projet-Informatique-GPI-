package data;

public class Goalkeeper extends Player {
	int plunge;
	int position;
	
	
	public Goalkeeper(int speed,int shooting_skills,int exhaust
			,boolean wounded,boolean substitute,int plunge,int position) {
		super(speed,shooting_skills,exhaust,wounded,substitute);
		plunge=this.plunge;
		position=this.position;
	}


	public int getPlunge() {
		return plunge;
	}


	public void setPlunge(int plunge) {
		this.plunge = plunge;
	}


	public int getPosition() {
		return position;
	}


	public void setPosition(int position) {
		this.position = position;
	}
	
	
}
