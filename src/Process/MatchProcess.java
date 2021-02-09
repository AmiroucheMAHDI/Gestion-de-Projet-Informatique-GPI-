package Process;
import java.util.ArrayList;
import java.util.Random;

import Other.*;
import data.Defender;
import data.Forward;
import data.Goalkeeper;
import data.*;

public class MatchProcess {
	private static ArrayList<Integer> scoreA;
	private static ArrayList<Integer> scoreB;
	private static String commentary;                       //use by the GUI to get the Score of all match
	
	public static Match MatchProcess(Team a, Team b,int type) {
		 scoreA=new ArrayList<Integer>();
		 scoreB=new ArrayList<Integer>();
			
		Match m = new Match(a, b, null, null, 0, 0, null, null);
		Team winner=Score(m,type);
		m.setWinner(winner);
		
		//stopTime.stopTime(1);

		return m;

	}
	
	public static Team Score(Match m,int type) { //if type=0 it's a group match else it's knockoutstage 1
		String winner="egalite";
		Random rand = new Random();
		int x = 0; //decide who is gonna get the bonus(0=team1, 1=team2)
		Team TeamWinner=null;
		
		//setting the different scores of the teams based on the skill of the teams
		if(ScoreGoal(m.getTeam1().getKeeper()) > ScoreGoal(m.getTeam2().getKeeper())) {
			scoreA.add(1);
			scoreB.add(0);
		}
		else {
			scoreB.add(1);
			scoreA.add(0);
		}
		if(ScoreForward(m.getTeam1().getForw()) > ScoreForward(m.getTeam2().getForw())) {
			scoreA.add(1);
			scoreB.add(0);
		}
		else {
			scoreB.add(1);
			scoreA.add(0);
		}
		if(ScoreDefender(m.getTeam1().getDef()) > ScoreDefender(m.getTeam2().getDef())) {
			scoreA.add(1);
			scoreB.add(0);
		}
		else {
			scoreB.add(1);
			scoreA.add(0);
		}
		
		//setting the score of the teams
		for (int i=0; i<scoreA.size(); i++) {
			if (scoreA.get(i)<scoreB.get(i)) {
				//m.setGoal1(m.getGoal1() + 1);
			}
			else {
				//m.setGoal2(m.getGoal2() + 1);
			}
		}
		
		//random factor
		int a = 20+(int) rand.nextInt(100 - 20 + 1);
		int b = 20+(int) rand.nextInt(100 - 20 + 1);
		if (0 <= (a - b) && (a - b) <= 30) {
			scoreA.add(0);
			scoreB.add(0);
		}
		else if (a<b) {
			//m.setGoal1(m.getGoal1() + 1);
			scoreA.add(1);
			scoreB.add(0);
		}
		else {
			//m.setGoal2(m.getGoal2() + 1);
			scoreB.add(1);
			scoreA.add(0);
		}
		
		//we factor in the coach skill of the teams
		if (m.getTeam1().getC().getSkill() < m.getTeam2().getC().getSkill()) {
			//m.setGoal2(m.getGoal2() + m.getTeam2().getC().getSkill()/50);
			scoreB.add(1);
			scoreA.add(0);
		}
		else {
			//m.setGoal1(m.getGoal1() + m.getTeam1().getC().getSkill()/50);
			scoreA.add(1);
			scoreB.add(0);
		}
		
		//make the score into real score(it was just attempts before) also adds a score attempt at the first test
		if (m.getTeam1().getBestF(m.getTeam1().getForw()).getPerfect_shoot() 
				< m.getTeam2().getBestF(m.getTeam2().getForw()).getPerfect_shoot()) {
			x = 1;
			scoreB.add(1);
			scoreA.add(0);
		}
		else {
			scoreA.add(1);
			scoreB.add(0);
		}
		for (int i=0; i<scoreA.size(); i++) {
			if (scoreA.get(i)>scoreB.get(i)) {
				if(x==0) {
					if (rand.nextInt(100) < 40 + m.getTeam1().getBestF(m.getTeam1().getForw()).getPerfect_shoot()/10) {
						m.setGoal1(m.getGoal1() + 1);
					}
				}
				else {
					if (rand.nextInt(100) < 40) {
						m.setGoal1(m.getGoal1() + 1);
					}
				}
			}
			else {
				if(x==1) {
					if (rand.nextInt(100) < 40 + m.getTeam2().getBestF(m.getTeam2().getForw()).getPerfect_shoot()/10) {
						m.setGoal2(m.getGoal2() + 1);
					}
				}
				else {
					if (rand.nextInt(100) < 40) {
						m.setGoal2(m.getGoal2() + 1);
					}
				}
			}
		}
		String typeMatch;
		if(type == 0 ) {
			typeMatch="Group match :";  
			
		}
		else if(type == 1) {
			typeMatch="Quarter-final match : ";
		}
		else if(type == 2) {
			typeMatch="Semi-final match : ";
		}
		else {
			typeMatch="final match : ";
		}
		
		String scoreMatch=m.getTeam1().getName()+": " 
				+ m.getGoal1() + " -  "+m.getTeam2().getName()+": " + m.getGoal2();
		
		String Match=typeMatch+scoreMatch;
		System.out.println(Match);
		m.SetCommentary(Match);
		
		//if it's a draw and it's not a group match we make it so that it's not a draw
		if ((type>0) && (m.getGoal1()==m.getGoal2())) {
			if(m.getTeam1().getC().getSkill()<m.getTeam2().getC().getSkill()) {
				m.setGoal1(m.getGoal1()+1);
			}
			else {
				m.setGoal2(m.getGoal2()+1);
			}
		}
		
		
		//get the winner
		if(m.getGoal1()>m.getGoal2()) {
			TeamWinner=m.getTeam1() ;
			winner=m.getTeam1().getName();
		}
		else if(m.getGoal1()<m.getGoal2()) {
			TeamWinner=m.getTeam2() ;
			winner=m.getTeam2().getName();
		}
		
		m.setResult("Match de poule scoreA : "+scoreA+" scoreB "+scoreB+", Winner : "+winner);
		
		return TeamWinner;
	}
	public static int ScoreGoal(ArrayList<Goalkeeper> keeper) {
		int score=0;
		for (int i=0; i<keeper.size(); i++) {
			if(keeper.get(i).isSubstitute()){
				score = score + keeper.get(i).getPlunge();
				score = score + keeper.get(i).getPosition();
			}
		}
		return score;
	}
	public static int ScoreForward(ArrayList<Forward> forw) {
		int score=0;
		for (int i=0; i<forw.size(); i++) {
			if(forw.get(i).isSubstitute()){
				score = score + forw.get(i).getPerfect_shoot();
				score = score + forw.get(i).getDrible();
			}
		}
		return score;
	}
	public static int ScoreDefender(ArrayList<Defender> def) {
		int score=0;
		for (int i=0; i<def.size(); i++) {
			if(def.get(i).isSubstitute()){
				score = score + def.get(i).getPhysique();
				score = score + def.get(i).getTackle();
			}
		}
		return score;
	}
	
	
}
