package Process;

import java.util.ArrayList;


import data.*;
import data.Coach;

import Process.*;
import Process.PlayerProcess;

public class EquipeProcess {
	
	//private static ArrayList<String> name=new ArrayList<String>();
	
	
	
	public static Team EquipeProcess(String name) {
		
		Team a=new Team();
		ArrayList<Goalkeeper> keeper;
		ArrayList<Forward> forw;
		ArrayList<Defender> def;
		
		Goalkeeper g;
		Forward f;
		Defender d;
		Coach c;
		
		keeper=new ArrayList<Goalkeeper>();
		forw=new ArrayList<Forward>();
		def=new ArrayList<Defender>();
		
		
		for(int i=0;i<3;i++) {
		    g=PlayerProcess.generateGoalkeeper(i);
			keeper.add(g);
		}
		
		for(int i=0;i<8;i++) {
		    f=PlayerProcess.generateForward(i);
			forw.add(f);
		}
		
		for(int i=0;i<12;i++) {
		    d=PlayerProcess.generateDefender(i);
			def.add(d);
		}
		
		c= CoachProcess.generateCoach() ;
		a.setName(name);
		a.setKeeper(keeper);
		a.setDef(def);
		a.setForw(forw);
		a.setC(c);
		
		return a;
	}
	
	

	

}
