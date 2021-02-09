package Other;

public class stopTime {

	public static void stopTime(int s) {
		try
		{
		    Thread.sleep(1000*s);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
	}
}
