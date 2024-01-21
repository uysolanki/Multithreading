package washingmachine;

public class Dry extends Thread 
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Dry " +i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e) {}
	    }
	}
}
