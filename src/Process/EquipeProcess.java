package Process;

import java.util.ArrayList;

import data.*;
import data.Coach;

import Process.*;
import Process.PlayerProcess;

public class EquipeProcess {
	
	private ArrayList<Goalkeeper> keeper;
	private ArrayList<Forward> forw;
	private ArrayList<Defender> def;
	private Coach c;
	
	public EquipeProcess() {
		Goalkeeper g;
		Forward f;
		Defender d;
		
		keeper=new ArrayList<Goalkeeper>();
		forw=new ArrayList<Forward>();
		def=new ArrayList<Defender>();
		
		
		for(int i=0;i<3;i++) {
		    g=PlayerProcess.generateGoalkeeper();
			keeper.add(g);
		}
		
		for(int i=0;i<8;i++) {
		    f=PlayerProcess.generateForward();
			forw.add(f);
		}
		
		for(int i=0;i<12;i++) {
		    d=PlayerProcess.generateDefender();
			def.add(d);
		}
		
		c= new Coach() ;
	}


	public void String() {
		System.out.println( "EquipeProcess [keeper=" + keeper + ", forw=" + forw + ", def=" + def + ", c=" + c + "]");
		System.out.println(keeper.size()+"--------------"+forw.size()+"---"+def.size()+"---"+c.getSkill());
	}
	

}
