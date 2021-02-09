package Process;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import Other.Rand;
import data.*;


	public class PlayerProcess {
	    private static int Max = 90;
		private static int Min = 20;
		static ArrayList<String> names = new ArrayList<String>();
		
	    
		public static void namesReading() {
	    	
	        BufferedReader br;
	        String motLu;
	        try{
	            br = new BufferedReader(new FileReader(new File("names.txt")));
	            while((motLu = br.readLine()) != null)
	            {
	                names.add(motLu);
	            }
	            br.close();
	        }catch(FileNotFoundException e){
	            e.printStackTrace();
	        }catch(IOException e){
	            e.printStackTrace();
	        }

	    }	
		
		 public static Goalkeeper generateGoalkeeper(int i) {
		    	Random rand = new Random();
		    	if(i==0) {
		    		
		            Goalkeeper g=new Goalkeeper(names.get(Rand.randomInt(0,170)),20+(int) rand.nextInt(Max - Min + 1),20+(int) rand.nextInt(Max - Min + 1),0,false,false,
		            		20+(int) rand.nextInt(Max - Min + 1),20+(int) rand.nextInt(Max - Min + 1));
		            g.setSubstitute(true);
		            return g;
		    	}else {
		    		Goalkeeper g=new Goalkeeper(names.get(Rand.randomInt(0,170)),20+(int) rand.nextInt(Max - Min + 1),20+(int) rand.nextInt(Max - Min + 1),0,false,false,
		            		20+(int) rand.nextInt(Max - Min + 1),20+(int) rand.nextInt(Max - Min + 1));
		    		 return g;
		    	}
		    }
		    
		    
		    
		    public static Forward generateForward(int i)
		    {
		    	Random rand = new Random();
		    	if(i>3) {
		            Forward forw=new Forward(names.get(Rand.randomInt(0,170)),20+(int) rand.nextInt(Max - Min + 1),
		            		20+(int) rand.nextInt(Max - Min + 1),0,false,true,
		            		20+(int) rand.nextInt(Max - Min + 1),20+(int) rand.nextInt(Max - Min + 1));
		            forw.setSubstitute(true);
		            return forw;
		    	}else {
		    		Forward forw=new Forward(names.get(Rand.randomInt(0,170)),20+(int) rand.nextInt(Max - Min + 1),
		            		20+(int) rand.nextInt(Max - Min + 1),0,false,false,
		            		20+(int) rand.nextInt(Max - Min + 1),20+(int) rand.nextInt(Max - Min + 1));
		    		return forw;
		    	}
		    }
		            
		            
		            
		    public static Defender generateDefender(int i)
		    {
		    	Random rand = new Random();
		    	if(i<6) {
		    		Defender d=new Defender(names.get(Rand.randomInt(0,170)),20+(int) rand.nextInt(Max - Min + 1),
		            		20+(int) rand.nextInt(Max - Min + 1),0,false,true,
		            		20+(int) rand.nextInt(Max - Min + 1),20+(int) rand.nextInt(Max - Min + 1));
		           d.setSubstitute(true);
		           return d;
		    	}else {
		    		Defender d=new Defender(names.get(Rand.randomInt(0,170)),20+(int) rand.nextInt(Max - Min + 1),
		            		20+(int) rand.nextInt(Max - Min + 1),0,false,false,
		            		20+(int) rand.nextInt(Max - Min + 1),20+(int) rand.nextInt(Max - Min + 1));
			           return d;
		    	}
		     }
	    
	    
	}
	    


