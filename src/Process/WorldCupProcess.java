package Process;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  

import java.util.ArrayList;

import javax.print.attribute.standard.MediaSize.Other;
import javax.swing.JFrame;

import IHM.*;
import Other.*;
import data.*;

public class WorldCupProcess {
	
	
	public static int pause=0;
	public static WorldCup W;
	private static Group A;
	private static Group B;
	private static Group C;
	private static Group D;
	private static int S1;
	private static int S2;
	
	public static WorldCup WorldCupProcess() throws InterruptedException {
		
		ArrayList<Team> team=new ArrayList<Team>();
		Team t1=EquipeProcess.EquipeProcess("Algerie");
		Team t2=EquipeProcess.EquipeProcess("Maroc");	
		Team t3=EquipeProcess.EquipeProcess("Tunisie");	
		Team t4=EquipeProcess.EquipeProcess("Egypte");	
		
		Team t5=EquipeProcess.EquipeProcess("France");
		Team t6=EquipeProcess.EquipeProcess("England");	
		Team t7=EquipeProcess.EquipeProcess("Allemagne");	
		Team t8=EquipeProcess.EquipeProcess("Espagne");
		
		Team t9=EquipeProcess.EquipeProcess("Pologne");
		Team t10=EquipeProcess.EquipeProcess("US");	
		Team t11=EquipeProcess.EquipeProcess("Brazil");	
		Team t12=EquipeProcess.EquipeProcess("Argentine");
		
		Team t13=EquipeProcess.EquipeProcess("Australie");
		Team t14=EquipeProcess.EquipeProcess("Canada");	
		Team t15=EquipeProcess.EquipeProcess("Finlande");	
		Team t16=EquipeProcess.EquipeProcess("Italie");
		
		team.add(t1);
		team.add(t2);
		team.add(t3);
		team.add(t4);
		team.add(t5);
		team.add(t6);
		team.add(t7);
		team.add(t8);
		team.add(t9);
		team.add(t10);
		team.add(t11);
		team.add(t12);
		team.add(t13);
		team.add(t14);
		team.add(t15);
		team.add(t16);
		
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
		LocalDateTime now = LocalDateTime.now();
		WorldCup WC=new WorldCup(dtf.format(now),"Paris",team);
		OnRun(WC);
		return WC;
		
		
	}
	
	
	
	public static void OnRun(WorldCup WC) throws InterruptedException {
		
		
		/*** information ***/
		System.out.println("The worldcup start today, "+WC.getDate()+" in "+WC.getCountry());
		
		
		A=GroupProcess.GroupProcess("A",WC.getTeamInit(0),WC.getTeamInit(1),WC.getTeamInit(2),WC.getTeamInit(3));
		S1 = A.getPoint1() ;
		S2 = A.getPoint2() ;
		
		B=GroupProcess.GroupProcess("B",WC.getTeamInit(4),WC.getTeamInit(5),WC.getTeamInit(6),WC.getTeamInit(7));
		
			
		C=GroupProcess.GroupProcess("C",WC.getTeamInit(8),WC.getTeamInit(9),WC.getTeamInit(10),WC.getTeamInit(11));
		
		
		D=GroupProcess.GroupProcess("D",WC.getTeamInit(12),WC.getTeamInit(13),WC.getTeamInit(14),WC.getTeamInit(15));
		
		
		/*KnockOutStage a1=KnockOutStageProcess.KnockOutStageProcess(A.getWinnerId(0),B.getWinnerId(1),1);
		System.out.println("");
		KnockOutStage a2=KnockOutStageProcess.KnockOutStageProcess(A.getWinnerId(1),B.getWinnerId(0),1);
		System.out.println("");
		KnockOutStage a3=KnockOutStageProcess.KnockOutStageProcess(C.getWinnerId(0),D.getWinnerId(1),1);
		System.out.println("");
		KnockOutStage a4=KnockOutStageProcess.KnockOutStageProcess(C.getWinnerId(1),D.getWinnerId(0),1);
		System.out.println("");
		KnockOutStage d1=KnockOutStageProcess.KnockOutStageProcess(a1.getWinnerTeam(),a2.getWinnerTeam(),2);
		System.out.println("");
		KnockOutStage d2=KnockOutStageProcess.KnockOutStageProcess(a3.getWinnerTeam(),a4.getWinnerTeam(),2);
		System.out.println("");
		KnockOutStage Final=KnockOutStageProcess.KnockOutStageProcess(d1.getWinnerTeam(),d2.getWinnerTeam(),3);
		System.out.println("");
		WC.setWinner(Final.getWinnerTeam());*/:
	}

	private int getScore1() {
		return S1;
	}
	
	private int getScore2() {
		return S2;
	}
}
