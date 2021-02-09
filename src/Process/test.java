package Process;

import javax.swing.JFrame;

import IHM.*;
import IHMi.FrameGameGUI;
import data.*;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method s
		
		
		PlayerProcess.namesReading();
		
	/*	System.out.println("Equipe 2");
		Team e2=EquipeProcess.EquipeProcess("Belgique");		
		e2.String();
		
		System.out.println("Test equipe skills");
		
		Match m = MatchProcess.MatchProcess(ep,e2,0);
		
		System.out.println(m.toString());
		
		System.out.println(m.NameWinner());*/
		
		
/*	Team team1=EquipeProcess.EquipeProcess("Algerie");
	Team team2=EquipeProcess.EquipeProcess("Maroc");	
	Team team3=EquipeProcess.EquipeProcess("Tunisie");	
	Team team4=EquipeProcess.EquipeProcess("Egypte");	
	
	Group group=GroupProcess.GroupProcess("A",team1, team2, team3, team4);*/
	//JFrame jf=new JFrame();
	PlayerProcess.namesReading();
	//WorldCup w = WorldCupProcess.WorldCupProcess();
	new FrameGameGUI("Game");
	/*JFrame a=new JFrame();
	//Gui_Team.Gui_Team(a);
	Gui_group.Gui_group(a);*/
	}

}
