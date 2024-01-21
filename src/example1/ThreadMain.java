package example1;

public class ThreadMain {

	public static void main(String[] args) //priority main() = 5
	{
		
		Numeric t1=new Numeric("NewGreat"); 
		t1.start();	
		
		while(true)
		{
			Thread.State state=t1.getState();
			System.out.println(state);
			if(state==Thread.State.TERMINATED)
			{
				break;
			}
		}
	}

}

