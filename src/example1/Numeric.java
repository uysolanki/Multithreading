package example1;

public class Numeric extends Thread {
	public Numeric() {}
	public Numeric(String tname)
	{
		super(tname);
	}
	
	public void run()
	{
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		
		for(int i=1;i<=26;i++)
		{
			System.out.println(i);
	    }
	}
	
}
