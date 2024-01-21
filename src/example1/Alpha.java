package example1;

public class Alpha implements Runnable {

	@Override
	public void run()
	{
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		
		for(char i='a';i<='z';i++)
		{
			try
			{
			Thread.sleep(500);
			}catch(InterruptedException ie) {}
			System.out.println(i);
		}
	}
	
	//did i get the start()NO
}

