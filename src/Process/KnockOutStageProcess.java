package Process;

import data.*;

public class KnockOutStageProcess {
	public static KnockOutStage KnockOutStageProcess(Team a, Team b,int type) {
			
			KnockOutStage k = new KnockOutStage(a,b,type);
			Team w = OnRun(k,type);
			k.setWinnerTeam(w);
			return k;
	
	}
	
	public static Team OnRun(KnockOutStage k,int type) {
	
		Match m = MatchProcess.MatchProcess(k.getTeam1(),k.getTeam2(),type);
		
		System.out.println("Winner : "+m.getWinner().getName());
		return m.getWinner();
	}
}
