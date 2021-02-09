package Process;

import java.util.Random;

import data.Coach;

public class CoachProcess {
	private static int Max = 100;
	private static int Min = 20;

    public static Coach generateCoach() {
    	Random rand = new Random();
    	Coach c=new Coach(20+(int) rand.nextInt(Max - Min + 1));
        return c;
    }
}
