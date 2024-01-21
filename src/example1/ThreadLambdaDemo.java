package example1;

public class ThreadLambdaDemo {

	public static void main(String[] args) {
		
		Thread t1=new Thread(
		()->
		{
			for(int i=1;i<=26;i++)
				System.out.println(i);
		}
		);
		
		t1.start();
		
		Thread t2=new Thread(
				()->
				{
					for(char i='A';i<='Z';i++)
						System.out.println(i);
				}
				);
				
		t2.start();

	}

}
