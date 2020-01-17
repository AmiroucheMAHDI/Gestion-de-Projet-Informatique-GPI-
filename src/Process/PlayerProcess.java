package Process;

import data.*;


	public class PlayerProcess {
	    private static int Max = 90;
		private static int Min = 20;
	    public static Goalkeeper generateGoalkeeper() {
	    	
	            Goalkeeper g=new Goalkeeper((int)(Math.random() * Max - Min),(int)(Math.random() * Max - Min),0,false,false,
	                    (int)(Math.random() * 10 - 1),(int)(Math.random() * 100 - Min));
	            return g;
	        }
	    
	    
	    
	    public static Forward generateForward()
	    {
	            Forward forw=new Forward((int)(Math.random() * Max - Min),
	            				(int)(Math.random() * Max - Min),0,false,false,
	            				(int)(Math.random() * 10 - 1),(int)(Math.random() * 100 - Min));
	            return forw;
	    }
	            
	            
	    //
	    public static Defender generateDefender()
	    {
	           Defender d= new Defender((int)(Math.random() * Max - Min),(int)(Math.random() * Max - Min),0,false,false,
	                    (int)(Math.random() * 10 - 1),(int)(Math.random() * 100 - Min));
	           return d;
	     }
	    
	    
	}
	    


