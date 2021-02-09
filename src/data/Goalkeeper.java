package data;

public class Goalkeeper extends Player {
	int plunge;
	int position;
	
	
	public Goalkeeper(String name,int speed,int shooting_skills,int exhaust
			,boolean wounded,boolean substitute,int plunge,int position) 
	{
		super(name,speed,shooting_skills,exhaust,wounded,substitute);
		this.plunge=plunge;
		this.position=position;
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
