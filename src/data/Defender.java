package data;

public class Defender extends Player {
	int physique;
	int tackle;
	public Defender(String name,int speed,int shooting_skills,int exhaust
			,boolean wounded,boolean substitute,int physique,int tackle) {
		super(name,speed,shooting_skills,exhaust,wounded,substitute);
		this.physique=physique;
		this.tackle=tackle;	
	}

	public int getPhysique() {
		return physique;
	}

	public void setPhysique(int physique) {
		this.physique = physique;
	}

	public int getTackle() {
		return tackle;
	}

	public void setTackle(int tackle) {
		this.tackle = tackle;
	}
	
	
	
}
