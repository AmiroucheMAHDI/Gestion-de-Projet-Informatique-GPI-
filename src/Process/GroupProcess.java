package Process;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import data.*;

public class GroupProcess {
	
	

	public static Group GroupProcess(String id,Team team1,Team team2,Team team3,Team team4) {
		
		Group group=new Group(team1,team2,team3,team4);
		
		System.out.println("");
		System.out.println("the group "+id+" compose of the team "+group.getTeam1().getName()+" - "+group.getTeam2().getName()+" - "+group.getTeam3().getName()+" - "+ group.getTeam4().getName()+ " will start now");
		OnRun(group);
		
		System.out.println("score1 = "+group.getPoint1()+ " Score 2 = "+group.getPoint2()+" Score3 = " +group.getPoint3() +" score4 = "+group.getPoint4());
		
		
		
		group.setWinner(Ranking(group));
		
		
		System.out.println("the winner of the group " +id+ " are  "+group.getWinnerId(0).getName()+" and "+group.getWinnerId(1).getName());
		
		return group;
		
	}
	
	public static void OnRun(Group a){
		
		goMatch(a,a.getTeam1(),a.getTeam2());   //Team 1 vs Team 2
		
		goMatch(a,a.getTeam3(),a.getTeam4());   //Team 3 vs Team 4
		
		goMatch(a,a.getTeam1(),a.getTeam3());   //Team 1 vs Team 3
		
		goMatch(a,a.getTeam2(),a.getTeam4());   //Team 2 vs Team 4
		
		goMatch(a,a.getTeam1(),a.getTeam4());   //Team 1 vs Team 4
		
		goMatch(a,a.getTeam2(),a.getTeam3());   //Team 2 vs Team 3
		
		
	}
	
	public static void goMatch(Group group,Team a , Team b){
	
		Match m = MatchProcess.MatchProcess(a,b,0);
		
		group.setCommentary(m.GetLastCommentary());
		
		if(a==m.getWinner()){
			group.getPoint(a, 1);
			group.getPoint(b, 0);
		}
		else if(b==m.getWinner()){
			group.getPoint(b, 1);
			group.getPoint(a, 0);
		}else {
			group.getPoint(a, 2);
			group.getPoint(b, 2);
		}
		
	}
	
	public static ArrayList<Team> Ranking(Group group){
		ArrayList<Team> rank=new ArrayList<Team>();

		
		int score1=group.getPoint1();
		int score2=group.getPoint2();
		int score3=group.getPoint3();
		int score4=group.getPoint4();
		
		ArrayList<Integer> val=new ArrayList();
		val.add(score1);
		val.add(score2);
		val.add(score3);
		val.add(score4);
		
		for(int j=0;j<val.size();j++) {
			int max=val.get(0);
			int index=0;
			for(int i=0;i<val.size();i++) {
				if(max<val.get(i)) {
					index=i;
					max=val.get(i);
				}
			}
			if(index==0) {
				rank.add(group.getTeam1());
		
			}
			else if(index==1) {
				rank.add(group.getTeam2());
			}
			else if(index==2) {
				rank.add(group.getTeam3());
				
			}
			else if(index==3) {
				rank.add(group.getTeam4());
				
			}
			
			val.set(index, -1);
			
			
		}
		
		for(int j=0;j<rank.size();j++) {
			System.out.println("Team "+rank.get(j).getName()+" is number "+(j+1));
		}
		
		ArrayList<Team> winner=new ArrayList<Team>();
		winner.add(rank.get(0));
		winner.add(rank.get(1));
		
		return winner;	
	}
}
