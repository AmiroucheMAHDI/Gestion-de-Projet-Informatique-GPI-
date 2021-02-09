package data;

import java.util.ArrayList;

public class Team {
	private String name;
	private int ranking;
	
	private ArrayList<Goalkeeper> keeper;
	public ArrayList<Goalkeeper> getKeeper() {
		return keeper;
	}

	public void setKeeper(ArrayList<Goalkeeper> keeper) {
		this.keeper = keeper;
	}

	public ArrayList<Forward> getForw() {
		return forw;
	}

	public void setForw(ArrayList<Forward> forw) {
		this.forw = forw;
	}

	public ArrayList<Defender> getDef() {
		return def;
	}

	public void setDef(ArrayList<Defender> def) {
		this.def = def;
	}

	public Coach getC() {
		return c;
	}

	public void setC(Coach c) {
		this.c = c;
	}
	public Forward getBestF(ArrayList<Forward> forw) {
		Forward best = null;
		for (int i=0; i<forw.size()-1; i++) {
			if (forw.get(i).getPerfect_shoot() > forw.get(i + 1).getPerfect_shoot()) {
				best = forw.get(i);
			}
			else {
				best = forw.get(i + 1);
			}
		}
		return best;
	}

	private ArrayList<Forward> forw;
	private ArrayList<Defender> def;
	
	private Coach c;
	
	public Team() {
		name="test";
		ranking=0;
		keeper=null;
		forw=null;
		def=null;
		c=null;
	}
	
	
	public Team(String name,ArrayList<Goalkeeper> keeper,ArrayList<Forward> forw, ArrayList<Defender> def,Coach c) {
		name="test";
		ranking=0;
		this.keeper=keeper;
		this.forw=forw;
		this.def=def;
		this.c=c;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
	public void String() {
		int numberPlayer=0;
		for(int i=0;i<def.size();i++) {
			Defender d=def.get(i);
			if(d.isSubstitute()) {
				numberPlayer++;
			}
		
		}
		System.out.println("number defender and non substitute ="+numberPlayer);
		numberPlayer=0;
		
		for(int i=0;i<keeper.size();i++) {
			Goalkeeper d=keeper.get(i);
			if(d.isSubstitute()) {
				numberPlayer++;
			}
		}
		System.out.println("number goal and non substitute ="+numberPlayer);
		
		numberPlayer=0;
		
		for(int i=0;i<forw.size();i++) {
			Forward d=forw.get(i);
			if(d.isSubstitute()) {
				numberPlayer++;
			}
		}
		System.out.println("number of forward and non substitute ="+numberPlayer);
		
		System.out.println("");
		for(int i=0;i<forw.size();i++) {
			Forward d=forw.get(i);
			System.out.println("type:forward ----- player name : "+d.getName()+"  speed : "+d.getSpeed()+"  perfect shoot skill "+ d.getPerfect_shoot()+"  dribble skill : "+d.getDrible() );
		}
		
		System.out.println("");
		for(int i=0;i<forw.size();i++) {
			Defender defender=def.get(i);
			System.out.println("type:Defender ----- player name : "+defender.getName()+"  speed : "+defender.getSpeed()+"  physique skill : "+ defender.getPhysique()+"  tackle skill : "+defender.getTackle() );
		}
		
		System.out.println("");
		for(int i=0;i<keeper.size();i++) {
			Goalkeeper keep=keeper.get(i);
			System.out.println("type:Goal ----- player name : "+keep.getName()+"  plunge skill : "+keep.getPlunge()+"  position skill : "+ keep.getPosition() );
		}
	}

	
}
