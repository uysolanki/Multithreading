package washingmachine;

public class WashingMachineMain {

	public static void main(String[] args) throws Exception {
		Soak t1=new Soak();//expected for 7 seconds
		Wash t2=new Wash();
		Dry t3=new Dry();
		t1.start();
		t1.join(3000);			//1st  Soak1
		t2.start(); 			//2nd  Soak2
		t2.join();				//3rd  Soak3  Wash 1
		t3.start();				//4th  Soak4  Wash 2
								//5th  Soak5  Wash 3
								//6th		  Wash 4 	      
	}							//7th         Wash 5
								//8th		  Dry 1
}
