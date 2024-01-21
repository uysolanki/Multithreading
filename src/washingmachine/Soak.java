package washingmachine;

public class Soak extends Thread 
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Soak " +i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e) {}
	    }
	}
}
